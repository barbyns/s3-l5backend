@Entity
public class Prestito {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Utente utente;

    @ManyToOne
    private ElementoCatalogo elementoPrestato;

    private LocalDate inizioPrestito;
    private LocalDate restituzionePrevista;
    private LocalDate restituzioneEffettiva;

    @PrePersist
    public void calcolaDataRestituzione() {
        this.restituzionePrevista = inizioPrestito.plusDays(30);
    }
}
