# OVO JE ZA TENIS, POSLEDNJE 19.05.2017


////////////////////////// TENNIS GAME KLASA //////////////////////////////////

package main;

public class TennisGame 
{	
	//////////////////// 41 deuce
	//////////////////// 42 advantage
	
	private int player1Points = 0;
	private int player2Points = 0;
	private boolean gameEnded = false;
	private String score = "0 - 0";
	
	public TennisGame() 
	{
	}
	
	public void PlayerOneScores()
	{
		if (player1Points == 0)
		{
			setPlayer1Points(15);
		}
		else if (player1Points == 15)
		{
			setPlayer1Points(30);
		}
		else if (player1Points == 30)
		{
			if (player2Points != 40)
			{
				setPlayer1Points(40);
			}
			else
			{
				setPlayer1Points(41);
				setPlayer2Points(41);
			}
		}
		else if (player1Points == 40)
		{
			if (player2Points != 40)
			{
				gameEnded = true;
			}
			else
			{
				setPlayer1Points(42);
			}
		}
		else if (player1Points == 41)
		{
			if (player2Points != 42)
			{
				setPlayer1Points(42);
			}
			else
			{
				setPlayer1Points(41);
				setPlayer2Points(41);
			}
		}
		else if (player1Points == 42)
		{
			gameEnded = true;
		}
	}
	
	public void PlayerTwoScores()
	{
		if (player2Points == 0)
		{
			setPlayer2Points(15);
		}
		else if (player2Points == 15)
		{
			setPlayer2Points(30);
		}
		else if (player2Points == 30)
		{
			if (player1Points != 40)
			{
				setPlayer2Points(40);
			}
			else
			{
				setPlayer1Points(41);
				setPlayer2Points(41);
			}
		}
		else if (player2Points == 40)
		{
			if (player1Points != 40)
			{
				gameEnded = true;
			}
			else
			{
				setPlayer2Points(42);
			}
		}
		else if (player2Points == 41)
		{
			if (player1Points != 42)
			{
				setPlayer2Points(42);
			}
			else
			{
				setPlayer1Points(41);
				setPlayer2Points(41);
			}
		}
		else if (player2Points == 42)
		{
			gameEnded = true;
		}
	}
	//////// GETTERS AND SETTERS ////////////
	
	public int getPlayer1Points() {
		return player1Points;
	}

	public void setPlayer1Points(int player1Points) {
		this.player1Points = player1Points;
		String score = player1Points + " - " + player2Points;
		setScore(score);
	}

	public int getPlayer2Points() {
		return player2Points;
	}

	public void setPlayer2Points(int player2Points) {
		this.player2Points = player2Points;
		String score = player1Points + " - " + player2Points;
		setScore(score);
	}

	public boolean isGameEnded() {
		return gameEnded;
	}

	public void setGameEnded(boolean gameEnded) {
		this.gameEnded = gameEnded;
	}

	public String getScore() {
		if (score == "0 - 0")
		{
			return score;
		}
		else
			return player1Points + " - " + player2Points;
	}

	public void setScore(String score) {
		this.score = score;
	}

}


////////////////////////// TESTNA KLASA //////////////////////////////////


package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import main.TennisGame;

// Testing of midgame scores before both players score three times
public class NumericScores {

	TennisGame game = new TennisGame();
	String score;
	
	@Test
	public void test_StartScore() {
		score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_15_0() {
		game.PlayerOneScores();
		score = game.getScore();
		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_30_0() {
		for(int i = 0; i < 2; i++)
			game.PlayerOneScores();

		score = game.getScore();
		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_40_0() {
		for(int i = 0; i < 3; i++)
			game.PlayerOneScores();
		
		score = game.getScore();
		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_0_15() {
		game.PlayerTwoScores();
		
		score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_0_30() {
		for(int i = 0; i < 2; i++)
			game.PlayerTwoScores();
		
		score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	
	@Test
	public void test_0_40() {
		for(int i = 0; i < 3; i++)
			game.PlayerTwoScores();

		score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 40", score);	
	}	
	
	
}
