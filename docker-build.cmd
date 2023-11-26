.\mvnw clean package 

docker build --build-arg JAR_FILE=target/*.jar -t jaredlangxpx/helloworld:1.0.0  .

docker push jaredlangxpx/helloworld:1.1.0
