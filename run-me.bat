cd producer
call gradlew.bat booJar
cd ..

cd consumer
call gradlew.bat bootJar
cd ..

docker-compose up
