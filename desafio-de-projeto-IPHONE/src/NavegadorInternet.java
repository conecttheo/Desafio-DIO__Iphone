public interface NavegadorInternet {
    boolean conexaoComInternet();
    void navegar(String url);
    void buscar(String termo);
}
