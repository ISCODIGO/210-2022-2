package cap.pkg8;

/**
 *
 * @author unah
 */
public class Clock {
    private byte hora;  // 0 - 23
    private byte minutos;  // 0 - 59
    private byte segundos;  // 0 - 59
    
    public static int instancias;
    
    public Clock() {
        setHora(0);
        setMinutos(0);
        setSegundos(0);
        instancias++;
    }
    
    /**
     * Esta clase sirve para manejar la funcionalidad basica de un reloj
     * 
     * @param h hora
     * @param m minutos
     * @param s segundos
     */
    public Clock(int h, int m, int s) {
        setHora(h);
        setMinutos(m);
        setSegundos(s);
        instancias++;
    }    
    
    // Constructor por copia
    public Clock(Clock otro) {
        setHora(otro.hora);
        setMinutos(otro.minutos);
        setSegundos(otro.segundos);
        instancias++;
    }

    /**
     * @return the hora
     */
    public byte getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = (byte)hora;
        }
    }

    /**
     * @return the minutos
     */
    public byte getMinutos() {        
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = (byte)minutos;
        }
    }

    /**
     * @return the segundos
     */
    public byte getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = (byte)segundos;
        }
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%s", 
                rellenarCeros(hora), 
                rellenarCeros(minutos), 
                rellenarCeros(segundos)
        );
    }
    
    private String rellenarCeros(int n) {
        if (n < 10) {
            return "0" + n;
        } else {
            return "" + n;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Clock) {
                // unboxing del objeto
                Clock temp = (Clock) obj;
                
                return this.hora == temp.hora 
                        && this.minutos == temp.minutos 
                        && this.segundos == temp.segundos;
            } 
            
            return false;
        }
    }
    
    
        
}
