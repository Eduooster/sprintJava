import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Historico {

    private String status_final;
    private String soluco;
    private List<Evento> eventos;

    public Historico() {
        this.eventos = new ArrayList<>();
    }

    public Historico(String status_final, String soluco) {
        this.status_final = status_final;
        this.soluco = soluco;

    }

    public String getStatus_final() {
        return status_final;
    }

    public void setStatus_final(String status_final) {
        this.status_final = status_final;
    }

    public String getSoluco() {
        return soluco;
    }

    public void setSoluco(String soluco) {
        this.soluco = soluco;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(Evento Novoevento) {
        System.out.println("O EVENTO: " +  Novoevento.getNome() + "adicionado");
        eventos.add(Novoevento);
        System.out.println(Novoevento.getNome() + "add");

    }



    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Historico historico = (Historico) o;
        return Objects.equals(getStatus_final(), historico.getStatus_final()) && Objects.equals(getSoluco(), historico.getSoluco()) && Objects.equals(getEventos(), historico.getEventos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus_final(), getSoluco(), getEventos());
    }

    @Override
    public String toString() {
        return "Historico{" +
                "status_final='" + status_final + '\'' +
                ", soluco='" + soluco + '\'' +
                ", eventos=" + eventos +
                '}';
    }
}