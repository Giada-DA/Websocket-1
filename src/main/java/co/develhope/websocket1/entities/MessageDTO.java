package co.develhope.websocket1.entities;

public class MessageDTO {

    private String tipo;
    private String messaggio;

    public MessageDTO() {
    }

    public MessageDTO(String tipo, String messaggio) {
        this.tipo = tipo;
        this.messaggio = messaggio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }
}