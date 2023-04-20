package edu.upc.dsa.models;
import edu.upc.dsa.util.RandomUtils;

import java.util.ArrayList;
import java.util.List;


public class Partida {

    String idpartida;
    String estado;
    Integer numjugadores;
    Integer numequipo;

    Integer vidajugador;

    Integer vidatotal;



    List<Producto> listaproductos;
    List<Jugador> listajugadores;
    List<Equipo> listaequipos;

    public Partida() {
        //this.id = RandomUtils.getId();
    }

    public Partida(String usuario, String njuego){
        this.idpartida= RandomUtils.getId();
        this.setNumjugadores(2);
        this.setNumequipo(2);
        this.setEstado(estado);
        this.setVidajugador(100);
        this.setVidatotal(100);
        this.setListaequipos(new ArrayList<Equipo>());
        this.setListajugadores(new ArrayList<Jugador>());
        this.setListaproductos(new ArrayList<Producto>());
    }



    public String getIdpartida() {
        return idpartida;
    }
    public void setIdpartida(String idpartida) {
        this.idpartida = idpartida;
    }
    private Integer getVidajugador(Integer vidajugador) {
        return vidajugador;
    }
    private void setVidajugador(Integer vidajugador) {
        this.vidajugador= vidajugador;
    }
    private Integer getVidatotal(Integer vidatotal) {
        return vidatotal;
    }
    private void setVidatotal(Integer vidatotal) {
        this.vidatotal= vidatotal;
    }
    public Integer getNumjugadores() {
        return numjugadores;
    }
    public void setNumjugadores(Integer numjugadores) {
        this.numjugadores = numjugadores;
    }
    public Integer getNumequipo() {
        return numequipo;
    }
    public void setNumequipo(Integer numequipo) {
        this.numequipo = numequipo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Equipo> getListaequipos() {
        return listaequipos;
    }

    public void setListaequipos(ArrayList<Equipo> listaequipos){this.listaequipos=listaequipos;}


    public List<Producto> getListaproductos() {
        return listaproductos;
    }
    public void setListaproductos(ArrayList<Producto> listaproductos){this.listaproductos=listaproductos;}

    public List<Jugador> getListajugadores() {
        return listajugadores;
    }

    public void setListajugadores(ArrayList<Jugador> listajugadores){this.listajugadores=listajugadores;}

    @Override
    public String toString() {
        return "Partida [ idpartida= "+ idpartida +", estado = "+ estado +", numeroequipos = " + numequipo + ", numerojugadores = " + numjugadores+ ", vidatotal = " + vidatotal +", vidadeljugador = " + vidajugador +"]";
    }









}
