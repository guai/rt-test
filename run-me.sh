cd ./producer
( "./gradlew" booJar )
cd ..

cd ./consumer
( "./gradlew" bootJar )
cd ..

docker-compose up
