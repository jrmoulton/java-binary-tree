package com.jrmoulton.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSingleNode()
    {
		TreeNode root = new TreeNode(2);
        assertTrue( App.countNodes(root) == 2 );
    }
}
