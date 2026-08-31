class partidoFutbol{
    String equipoLocal;
    String equipoVisitante;
    int golLocal;
    int golVisitante;

public partidoFutbol(String equipoLocal, String equipoVisitante, int golLocal, int golVisitante){
    this.equipoLocal = equipoLocal;
    this.equipoVisitante = equipoVisitante;
    this.golLocal = 0;
    this.golVisitante = 0;
}


void golesLocal(){
    this.golLocal ++;
}

void golesVisitante(){
    this.golVisitante ++;
}

void mostrarResultado(){
System.out.println("===========================================================");
System.out.println("Local: " + equipoLocal + " / Visitante: " + equipoVisitante);
System.out.println("===========================================================");
System.out.println("Marcador");
System.out.println("Local: " + golLocal + " - Visitante: " + golVisitante);
}

public static void main(String[] args) {
    
    partidoFutbol p1 = new partidoFutbol("San Martin", "La Amistad", 0, 0);
p1.golesLocal();
p1.golesLocal();
p1.golesVisitante();

p1.mostrarResultado();

}
}