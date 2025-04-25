package Opdracht_Testing;
import Opdracht_Testing.Opdracht_1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppervlakteBerekeningenTest{
    @Test
    public void oppervlakteDriehoekMoetKloppen(){
        assertEquals(8, Opdracht_1.berekenDriehoek(8, 2), 0.5);
    }
}