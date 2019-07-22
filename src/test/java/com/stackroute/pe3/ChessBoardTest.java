package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setup() {
        chessBoard = new ChessBoard();
    }

    @After
    public void teardown() {
        chessBoard = null;
    }


    @Test
    public void givenNumberOfRowsReturnsAStringOfChessBoardPattern() {
//        act
        chessBoard.initialisation(8);
        String actualResult = chessBoard.chessBoardPattern();
        String expectedResult = "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n";
//        assert
        assertEquals(expectedResult, actualResult);
    }


}
