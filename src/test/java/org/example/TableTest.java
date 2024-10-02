package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    Table table = new Table(2,2);
    @Test
    void getValue() {
        table.setValue(0,0, 2);
        table.setValue(0,1, 2);
        assertEquals(2, table.getValue(0,0));
        assertEquals(2, table.getValue(0,1));
        assertEquals(0, table.getValue(1,0));
    }

    @Test
    void rows() {
        assertEquals(2, table.rows());
    }

    @Test
    void cols() {
        assertEquals(2, table.cols());
    }

    @Test
    void testToString() {
        table.setValue(0,0, 2);
        table.setValue(0,1, 2);
        assertEquals("2 2 ", table.toString(0));
        assertEquals("0 0 ", table.toString(1));
    }

    @Test
    void average() {
        table.setValue(0,0, 2);
        table.setValue(0,1, 2);
        assertEquals(1, table.average());
    }
}