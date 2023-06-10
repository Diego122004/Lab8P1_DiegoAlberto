/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_diegoalberto;

/**
 *
 * @author 50432
 */
public class Libro {

    private String tl;//Titulo del libro
    private String ne;//Nombre del autor
    private int ap;//Año de publicacion

    public Libro() {

    }

    public Libro(String tl2, String ne2, int ap) {

        this.tl = tl2;
        this.ne = ne2;
        this.ap = ap;
    }

    public String getTitulo() {
        return tl;
    }

    public String getEscritor() {
        return ne;
    }

    public int getPublicacion() {
        return ap;
    }

    public void setTitulo(String tl2) {
        this.tl = tl2;

    }

    public void setEscritor(String ne2) {
        this.ne = ne2;
    }

    public void setPublicacion(int ap2) {
        this.ap = ap2;
    }
}

