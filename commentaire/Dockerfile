# Utilisez une image OpenJDK 8
FROM openjdk:8

# Exposez le port sur lequel votre application Spring Boot écoute
EXPOSE 8189

# Copiez le fichier JAR de votre application dans l'image
ADD target/commentaire.jar commentaire.jar

# Commande pour exécuter l'application lorsque le conteneur démarre
ENTRYPOINT ["java", "-jar", "/commentaire.jar"]
