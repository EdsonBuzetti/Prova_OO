public abstract class AchadoPerdido implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String local_achado;
    private String data_hora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String foto, String tipo, String local_achado, String data_hora, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
        this.status = status;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String buscarTitulo(String titulo) {
        if (this.titulo.equalsIgnoreCase(titulo)) {
            return "Título: " + this.titulo + "\nDescrição: " + this.descricao + "\nLocal encontrado: " + this.local_achado;
        } else {
            return "Não encontrado";
        }
    }
    public void visualizaDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Foto: " + foto);
        System.out.println("Local achado: " + local_achado);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
    }
}
