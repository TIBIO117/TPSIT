#include <stdio.h>

#define PI_GRECO 3.14	

int main () 
{
	float raggio, volume, altezza;
	printf("dammi il raggio di un cilindro");
	scanf("%f", &raggio);
	printf("dammi l'altezza di un cilindro");
	scanf("%f", &altezza);
	volume=PI_GRECO*(raggio*raggio)*altezza;
	printf("il volume e: %0.2f", volume);
	return 0; 
}