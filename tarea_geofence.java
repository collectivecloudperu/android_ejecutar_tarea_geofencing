// Declaro la variable 'distgeo' para las coordenados con formato de 2 valores 
float[] distgeo = new float[2]; 

// Con la función 'distanceBetween' de Android, obtengo la distancia aproximada entre la ubicación del pasajero(latp, lngp) y el conductor (latc, lngc) 
Location.distanceBetween(latp,lngp,latc,lngc,distgeo); 

// Con la sentencia 'if' verifico si el conductor esta dentro de los 300 metros de radio

if(distgeo[0] < 300){ 

	// Ejecuto una tarea } 

// Si no es así realizo alguna tarea 
else { 
	// Alguna tarea 
}
