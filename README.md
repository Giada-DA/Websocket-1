# Esercizio - Spring Boot - Web Socket 1
* scrivere un'applicazione Spring Boot con le dipendenze necessarie che:
  * usa i websocket per inviare un messaggio a tutti i client che si sono iscritti all'argomento `broadcast`
  * espone l'endpoint per l'invio del messaggio su "broadcast-message" che:
    * accetta un payload di `MessageDTO` che ha 2 proprietà:
      * `tipo`
      * `messaggio`
  * ha un frontend simulato che:
    * si connette usando `SockJS`
    * stampa sullo schermo il `MessageDTO`
* l'output nel browser sarà simile alla seguente immagine:

![](output.PNG)

* inviare un messaggio al cliente abbonato utilizzando `Postman`
* **nota per i revisori**: visualizza `WebSocket1.postman_collection.json` nella cartella principale per tutte le chiamate `Postman`



# Exercise - Spring Boot - Web Socket 1
* write a Spring Boot application with the necessary dependencies that:
  * uses websockets to a message to all the clients that subscribed to the topic `broadcast`
  * exposes the endpoint for sending the message on `broadcast-message` that:
    * accepts a payload of `MessageDTO` that has 2 properties:
      * `type`
      * `message`
  * has a mocked frontend that:
    * connects using `SockJS`
    * prints on screen the `MessageDTO`
* the output in the browser will be similar to the following picture:

![](output.PNG)

* send a message to the subscribed client using `Postman`
* **note for reviewers**: view `WebSocket1.postman_collection.json` in the root folder for all the `Postman` calls
