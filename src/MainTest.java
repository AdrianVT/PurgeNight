
import itumulator.executable.Program;
import itumulator.world.Location;
import itumulator.world.World;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MainTest {
    @Test
    public void testAddEntityWhenMapIsFull() {
        // Initialize your program with a small map
        Program program = new Program(2, 800, 1000); // Example: a 2x2 map
        World world = program.getWorld();

        // Fill the map
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                world.setTile(new Location(x, y), new Person());
            }
        }

        // Attempt to add another entity
        // You'll need to replace this with whatever method your program uses
        // to handle adding entities to the map
        world.setTile(new Location(0, 2), new Person());
        boolean wasAdded = false; // Replace with actual attempt to add another entity

        // Assert that the entity was not added
        assertFalse(wasAdded, "The map should not accept more entities when full");
    }
}