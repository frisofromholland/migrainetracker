## Start MongoDB
- docker-compose up -d
-   
-   
- docker run -it --rm --name track-mongo -p 27017:27017  -e MONGO_INITDB_ROOT_USERNAME=mongo -e MONGO_INITDB_ROOT_PASSWORD=mongo123 mongo:latest
