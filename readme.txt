This mainly uses the MojoHaus JAXB Maven Plugin Basic Examples

http://www.mojohaus.org/jaxb2-maven-plugin/Documentation/v2.2/example_xjc_basic.html

Why?  To make an independent “nl.wldelft” jar and add it to local maven repositoryi.    This wil make this app a maven dependency intended to be just included in Spring Boot Application runner to pull up the FEWS format forecast data from file(s) and persist into database.  This will achieve clean separation between the many, many “machine-generated” classes and few “human-authored” domain classes needed for database.  

This will also help in “aligning” JDK versions of generated code to production runtime version, should a downshift become necessary.  

Can also consider alternate frameworks like Apache CXF  which also uses JAXB (by default), integrates well with Spring.  There is also SOAP UI.  

Note the conventional placement of XSD files and also (importantly) the binding XJB file in the project directory structure.  Normally just the XSD files would be sufficient, the binding file is there  to ensure that value attribute of the event tag in FEWS schema is not clashing with JAXB.   


1.  mvn clean install will create an fews.jar and put it in maven locl repo.  Need to see if this could be a good stopping point.   

However, this needs to be further augmented to incorporate the XMLRootElement of the parser as below.  The XSD, XJB files will first create the generated sources through the mvn clean install.  However need to then add/declare the TimeSeriesCollectionComplexType as the XMLRootElement.  The code generator cannot fathom what the root element is.  

2.  Copy generated sources in target directory into the source (fews/src) directory.  This is the source that is checked into Git (NOT the raw generated source) 
3.  Then the TimeSeriesCollectionComplexType is annotated as XMLRootElement.  
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TimeSeries")
public class TimeSeriesCollectionComplexType {

4.  And only after that the ant script is run to create the fewsWithXmlRootElement-1.0.jar file in the target directory.  

5.  Update the local maven repo like so:

mvn install:install-file -Dfile=target/fewsWithXmlRootElement-1.0.jar -DgroupId=nl.wldelft.fews -DartifactId=fews -Dversion=1.0 -Dpackaging=jar  -DpomFile=pom.xml

See fews-test, which imports this from local repo and parses a ensemble file
UnReg/ACJU1L_F.SIM24.SQME.24.CS.xml   

Other references: 

This was further informed by the following:

http://www.journaldev.com/1312/how-to-generate-java-classes-from-xsd-using-xjc-maven-plugin

http://lauraliparulo.altervista.org/generating-jaxb-classes-from-a-xsd-schema-in-a-maven-project/
