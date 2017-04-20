/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ezl
 */
public class CombatTest {
    private Player player;
    private Boundary boundary;
    private Enemy enemy;
    private Combat combat;
    
    public CombatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        player = new Player(50, 50, 4);
        enemy = new Enemy().makeEnemy(5, 2, "Skeleton", "Skelet");
        boundary = new Boundary();
        combat = new Combat(boundary);
        player.setSpell(new Spell("Fire ball", 8, 3));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of firstHit method, of class Combat.
     */
    @Test
    public void testFirstHit() {
        System.out.println("firstHit");
        Player player = this.player;
        Boundary boundary = this.boundary;
        Combat instance = this.combat;
        instance.firstHit(player, boundary);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fight method, of class Combat.
     */
    @Test
    public void testFight() {
        System.out.println("fight");
        Player player = this.player;
        Enemy enemy = this.enemy;
        boolean spell = false;
        Combat instance = this.combat;
        instance.fight(player, enemy, spell);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of playerAttack method, of class Combat.
     */
    @Test
    public void testPlayerAttack() {
        System.out.println("playerAttack");
        Player player = this.player;
        Enemy enemy = this.enemy;
        boolean spell = false;
        Combat instance = this.combat;
        instance.playerAttack(player, enemy, spell);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of enemyAttack method, of class Combat.
     */
    @Test
    public void testEnemyAttack() {
        System.out.println("enemyAttack");
        Player player = this.player;
        Enemy enemy = this.enemy;
        Combat instance = this.combat;
        instance.enemyAttack(player, enemy);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
