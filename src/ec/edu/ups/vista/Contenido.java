/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

/**
 *
 * @author Domenica Cañizares
 */
public final class Contenido {

    private String palabra[];
    private String palElegida;
    private String palFormada[];
    private int bandera;
    private int random;

    private String aux;
    private String nuevaPal;
    private int cont;

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String getPalElegida() {
        return palElegida;
    }

    public void setPalElegida(String palElegida) {
        this.palElegida = palElegida;
    }

    public String[] getPalFormada() {
        return palFormada;
    }

    public void setPalFormada(String[] palFormada) {
        this.palFormada = palFormada;
    }

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }

    public String getNuevaPal() {
        return nuevaPal;
    }

    public void setNuevaPal(String nuevaPal) {
        this.nuevaPal = nuevaPal;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    public Contenido() {
        
        palElegida = escogerPalabra();
        llenarPal();
        palFormada = new String[palElegida.length()];
        bandera = 0;
    }

    public String escogerPalabra() {
        random = (int) ((Math.random() * 10));
        return palabra[random];
    }

    public void llenarPal() {
        for (int i = 0; i < palFormada.length; i++) {
            palFormada[i] = "* ";
        }
    }

    public String compararPal(char letra) {
        System.out.println(palElegida);
        aux = "";
        nuevaPal = "";
        cont = 0;
        bandera = 0;

        while (cont < palElegida.length()) {
            if (letra == palElegida.charAt(cont) && (palFormada[cont].equals("*"))) {
                aux += letra;
                palFormada[cont]= aux;
                aux="";
                cont++;
                bandera=1;
            }else{
                cont++;
            }
        }
        for (int i = 0; i < palFormada.length; i++) {
            nuevaPal += palFormada[i];
        }
        return nuevaPal;
    }
    
    
}
