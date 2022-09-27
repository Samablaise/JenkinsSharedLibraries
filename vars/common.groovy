def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stageName}" == "Sonarqube Report")
     {
       sh "mvn clean sonar:sonar"
     }
   else if ("${stageName}" == "Upload to Nexus")
     {
       sh "mvn clean deploy"
     }      
}
