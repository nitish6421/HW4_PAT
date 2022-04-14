
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test01"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert(100);
    aVLTree0.insert(2);
    aVLTree0.delete((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test02"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    int i20 = aVLTree9.getBalance(node19);
    int i21 = aVLTree0.getBalance(node19);
    int i22 = aVLTree0.height();
    AVLTree.Node node23 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete(2);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node32 = aVLTree28.find((int)'4');
    aVLTree28.insert(0);
    int i35 = aVLTree28.height();
    AVLTree.Node node37 = aVLTree28.find((int)(short)-1);
    aVLTree28.insert((int)(short)1);
    AVLTree.Node node40 = aVLTree28.getRoot();
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    aVLTree41.insert(0);
    AVLTree.Node node46 = aVLTree41.getRoot();
    int i47 = aVLTree28.getBalance(node46);
    aVLTree28.insert(10);
    AVLTree.Node node50 = aVLTree28.getRoot();
    aVLTree28.delete((int)(byte)100);
    AVLTree aVLTree53 = new AVLTree();
    AVLTree.Node node54 = null;
    int i55 = aVLTree53.getBalance(node54);
    AVLTree.Node node57 = aVLTree53.find((int)'4');
    aVLTree53.insert(0);
    AVLTree.Node node60 = aVLTree53.getRoot();
    AVLTree.Node node61 = aVLTree53.getRoot();
    aVLTree53.insert((int)(byte)1);
    AVLTree.Node node64 = aVLTree53.getRoot();
    int i65 = aVLTree28.getBalance(node64);
    AVLTree.Node node66 = aVLTree28.getRoot();
    int i67 = aVLTree0.getBalance(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test03"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.delete((int)'#');
    int i11 = aVLTree0.height();
    int i12 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test04"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)'4');
    aVLTree0.insert((int)(byte)1);
    aVLTree0.insert(100);
    AVLTree.Node node32 = aVLTree0.find(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test05"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    AVLTree aVLTree23 = new AVLTree();
    aVLTree23.insert(0);
    AVLTree.Node node26 = aVLTree23.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    aVLTree0.insert((int)'#');
    AVLTree.Node node31 = aVLTree0.find((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test06"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    int i19 = aVLTree0.getBalance(node18);
    aVLTree0.insert(10);
    AVLTree.Node node22 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    AVLTree.Node node33 = aVLTree25.getRoot();
    aVLTree25.insert((int)(byte)1);
    AVLTree.Node node36 = aVLTree25.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    int i38 = aVLTree0.height();
    int i39 = aVLTree0.height();
    int i40 = aVLTree0.height();
    aVLTree0.delete((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test07"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree.Node node10 = aVLTree0.find((int)(short)0);
    aVLTree0.delete((int)(short)-1);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree.Node node14 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test08"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.delete(0);
    aVLTree0.insert((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test09"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node6 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)' ');
    int i9 = aVLTree0.height();
    aVLTree0.delete((int)'#');
    AVLTree.Node node13 = aVLTree0.find(10);
    AVLTree.Node node15 = aVLTree0.find(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test10"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    int i4 = aVLTree0.height();
    int i5 = aVLTree0.height();
    AVLTree.Node node7 = aVLTree0.find(100);
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree.Node node13 = aVLTree9.find((int)'4');
    aVLTree9.insert(0);
    int i16 = aVLTree9.height();
    AVLTree.Node node18 = aVLTree9.find((int)(short)-1);
    AVLTree.Node node20 = aVLTree9.find((int)'#');
    AVLTree.Node node22 = aVLTree9.find((int)(byte)-1);
    aVLTree9.delete(100);
    AVLTree.Node node25 = aVLTree9.getRoot();
    AVLTree.Node node26 = aVLTree9.getRoot();
    aVLTree9.delete((int)' ');
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    aVLTree29.insert(0);
    AVLTree.Node node34 = aVLTree29.getRoot();
    aVLTree29.delete((int)(byte)100);
    aVLTree29.delete((int)(short)10);
    AVLTree aVLTree39 = new AVLTree();
    AVLTree.Node node40 = null;
    int i41 = aVLTree39.getBalance(node40);
    AVLTree.Node node43 = aVLTree39.find((int)'4');
    aVLTree39.insert(0);
    AVLTree.Node node46 = aVLTree39.getRoot();
    AVLTree.Node node47 = aVLTree39.getRoot();
    int i48 = aVLTree39.height();
    AVLTree.Node node49 = aVLTree39.getRoot();
    int i50 = aVLTree29.getBalance(node49);
    AVLTree.Node node52 = aVLTree29.find((int)(byte)10);
    int i53 = aVLTree29.height();
    AVLTree.Node node54 = aVLTree29.getRoot();
    int i55 = aVLTree9.getBalance(node54);
    int i56 = aVLTree0.getBalance(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test11"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    aVLTree0.insert(1);
    AVLTree.Node node25 = aVLTree0.find((int)'#');
    AVLTree.Node node27 = aVLTree0.find((int)(short)1);
    AVLTree.Node node29 = aVLTree0.find((int)(short)10);
    aVLTree0.insert(0);
    int i32 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test12"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    int i23 = aVLTree0.getBalance(node22);
    AVLTree.Node node24 = aVLTree0.getRoot();
    AVLTree aVLTree25 = new AVLTree();
    aVLTree25.insert(0);
    AVLTree.Node node28 = aVLTree25.getRoot();
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    int i36 = aVLTree29.height();
    AVLTree.Node node38 = aVLTree29.find((int)(short)-1);
    aVLTree29.insert((int)(short)1);
    AVLTree.Node node41 = aVLTree29.getRoot();
    aVLTree29.delete((int)(byte)0);
    aVLTree29.delete((int)(short)10);
    AVLTree aVLTree46 = new AVLTree();
    AVLTree.Node node47 = null;
    int i48 = aVLTree46.getBalance(node47);
    AVLTree aVLTree49 = new AVLTree();
    AVLTree.Node node50 = null;
    int i51 = aVLTree49.getBalance(node50);
    AVLTree.Node node53 = aVLTree49.find((int)'4');
    aVLTree49.insert(0);
    AVLTree.Node node56 = aVLTree49.getRoot();
    int i57 = aVLTree46.getBalance(node56);
    int i58 = aVLTree29.getBalance(node56);
    int i59 = aVLTree25.getBalance(node56);
    int i60 = aVLTree0.getBalance(node56);
    AVLTree.Node node62 = aVLTree0.find((int)' ');
    AVLTree.Node node64 = aVLTree0.find(2);
    AVLTree.Node node65 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test13"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree.Node node13 = aVLTree9.find((int)'4');
    aVLTree9.insert(0);
    AVLTree.Node node16 = aVLTree9.getRoot();
    AVLTree.Node node17 = aVLTree9.getRoot();
    int i18 = aVLTree9.height();
    AVLTree aVLTree19 = new AVLTree();
    AVLTree.Node node20 = null;
    int i21 = aVLTree19.getBalance(node20);
    AVLTree aVLTree22 = new AVLTree();
    AVLTree.Node node23 = null;
    int i24 = aVLTree22.getBalance(node23);
    AVLTree.Node node26 = aVLTree22.find((int)'4');
    aVLTree22.insert(0);
    AVLTree.Node node29 = aVLTree22.getRoot();
    int i30 = aVLTree19.getBalance(node29);
    int i31 = aVLTree9.getBalance(node29);
    aVLTree9.delete((int)(short)10);
    aVLTree9.delete(100);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    AVLTree.Node node40 = aVLTree36.find((int)'4');
    aVLTree36.insert(0);
    aVLTree36.insert((int)(byte)10);
    AVLTree.Node node45 = aVLTree36.getRoot();
    int i46 = aVLTree9.getBalance(node45);
    int i47 = aVLTree0.getBalance(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test14"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    AVLTree.Node node11 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)10);
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    int i25 = aVLTree18.height();
    AVLTree.Node node27 = aVLTree18.find((int)(short)-1);
    AVLTree.Node node29 = aVLTree18.find((int)'#');
    AVLTree.Node node31 = aVLTree18.find((int)(byte)-1);
    aVLTree18.delete(100);
    AVLTree.Node node34 = aVLTree18.getRoot();
    AVLTree.Node node35 = aVLTree18.getRoot();
    aVLTree18.delete((int)' ');
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    aVLTree38.insert(0);
    AVLTree.Node node43 = aVLTree38.getRoot();
    aVLTree38.delete((int)(byte)100);
    aVLTree38.delete((int)(short)10);
    AVLTree aVLTree48 = new AVLTree();
    AVLTree.Node node49 = null;
    int i50 = aVLTree48.getBalance(node49);
    AVLTree.Node node52 = aVLTree48.find((int)'4');
    aVLTree48.insert(0);
    AVLTree.Node node55 = aVLTree48.getRoot();
    AVLTree.Node node56 = aVLTree48.getRoot();
    int i57 = aVLTree48.height();
    AVLTree.Node node58 = aVLTree48.getRoot();
    int i59 = aVLTree38.getBalance(node58);
    AVLTree.Node node61 = aVLTree38.find((int)(byte)10);
    int i62 = aVLTree38.height();
    AVLTree.Node node63 = aVLTree38.getRoot();
    int i64 = aVLTree18.getBalance(node63);
    int i65 = aVLTree0.getBalance(node63);
    AVLTree.Node node66 = aVLTree0.getRoot();
    aVLTree0.delete((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test15"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.delete(0);
    AVLTree.Node node11 = aVLTree0.getRoot();
    AVLTree.Node node13 = aVLTree0.find(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test16"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    aVLTree0.delete((int)(byte)100);
    aVLTree0.insert((int)(byte)-1);
    AVLTree.Node node21 = aVLTree0.getRoot();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test17"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node7 = aVLTree0.find((int)(byte)100);
    int i8 = aVLTree0.height();
    aVLTree0.delete(2);
    AVLTree.Node node12 = aVLTree0.find((int)(short)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    int i18 = aVLTree13.height();
    aVLTree13.delete((int)(byte)-1);
    aVLTree13.delete((int)(short)0);
    int i23 = aVLTree13.height();
    aVLTree13.insert((int)(byte)-1);
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree.Node node30 = aVLTree26.find((int)'4');
    aVLTree26.insert(0);
    AVLTree.Node node33 = aVLTree26.getRoot();
    AVLTree.Node node34 = aVLTree26.getRoot();
    AVLTree.Node node36 = aVLTree26.find(10);
    AVLTree.Node node38 = aVLTree26.find((int)(byte)-1);
    AVLTree.Node node39 = aVLTree26.getRoot();
    int i40 = aVLTree13.getBalance(node39);
    AVLTree.Node node41 = aVLTree13.getRoot();
    int i42 = aVLTree0.getBalance(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test18"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree.Node node18 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test19"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)1);
    AVLTree.Node node11 = aVLTree0.getRoot();
    AVLTree.Node node12 = aVLTree0.getRoot();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test20"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node15 = aVLTree0.getRoot();
    AVLTree.Node node17 = aVLTree0.find(10);
    aVLTree0.delete(10);
    AVLTree.Node node20 = aVLTree0.getRoot();
    AVLTree.Node node22 = aVLTree0.find((int)(short)1);
    AVLTree.Node node23 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test21"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    int i13 = aVLTree0.height();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree aVLTree15 = new AVLTree();
    AVLTree.Node node16 = null;
    int i17 = aVLTree15.getBalance(node16);
    AVLTree.Node node19 = aVLTree15.find((int)'4');
    aVLTree15.insert(0);
    AVLTree.Node node22 = aVLTree15.getRoot();
    int i23 = aVLTree14.getBalance(node22);
    int i24 = aVLTree0.getBalance(node22);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    int i32 = aVLTree25.height();
    AVLTree.Node node34 = aVLTree25.find((int)(short)-1);
    AVLTree.Node node36 = aVLTree25.find((int)'#');
    AVLTree.Node node38 = aVLTree25.find((int)(byte)-1);
    aVLTree25.delete(100);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    aVLTree41.insert(0);
    AVLTree.Node node46 = aVLTree41.getRoot();
    AVLTree.Node node47 = aVLTree41.getRoot();
    int i48 = aVLTree25.getBalance(node47);
    AVLTree aVLTree49 = new AVLTree();
    AVLTree.Node node50 = null;
    int i51 = aVLTree49.getBalance(node50);
    AVLTree.Node node53 = aVLTree49.find((int)'4');
    aVLTree49.insert(0);
    int i56 = aVLTree49.height();
    AVLTree.Node node58 = aVLTree49.find((int)(short)-1);
    AVLTree.Node node60 = aVLTree49.find((int)' ');
    AVLTree.Node node62 = aVLTree49.find((int)(short)1);
    aVLTree49.insert((int)(short)10);
    aVLTree49.delete((int)(byte)100);
    AVLTree.Node node67 = aVLTree49.getRoot();
    int i68 = aVLTree25.getBalance(node67);
    int i69 = aVLTree0.getBalance(node67);
    AVLTree.Node node70 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test22"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    AVLTree.Node node12 = aVLTree0.find((int)'4');
    aVLTree0.insert(100);
    int i15 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test23"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    AVLTree.Node node11 = aVLTree0.getRoot();
    int i12 = aVLTree0.height();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    AVLTree.Node node19 = aVLTree13.getRoot();
    AVLTree.Node node21 = aVLTree13.find((int)(short)10);
    AVLTree.Node node22 = aVLTree13.getRoot();
    int i23 = aVLTree13.height();
    AVLTree.Node node24 = aVLTree13.getRoot();
    int i25 = aVLTree13.height();
    AVLTree.Node node26 = aVLTree13.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    int i28 = aVLTree0.height();
    AVLTree.Node node30 = aVLTree0.find((int)(short)100);
    aVLTree0.delete((int)'a');
    AVLTree.Node node34 = aVLTree0.find((int)(short)100);
    aVLTree0.insert(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test24"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    aVLTree13.insert((int)(short)-1);
    AVLTree.Node node21 = aVLTree13.getRoot();
    AVLTree aVLTree22 = new AVLTree();
    aVLTree22.insert(0);
    AVLTree.Node node26 = aVLTree22.find(100);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    aVLTree27.insert(0);
    int i32 = aVLTree27.height();
    aVLTree27.delete((int)(byte)-1);
    AVLTree aVLTree35 = new AVLTree();
    AVLTree.Node node36 = null;
    int i37 = aVLTree35.getBalance(node36);
    AVLTree.Node node39 = aVLTree35.find((int)'4');
    aVLTree35.insert(0);
    AVLTree.Node node42 = aVLTree35.getRoot();
    int i43 = aVLTree27.getBalance(node42);
    int i44 = aVLTree22.getBalance(node42);
    aVLTree22.insert((int)(short)-1);
    AVLTree.Node node48 = aVLTree22.find(10);
    aVLTree22.insert((int)' ');
    AVLTree aVLTree51 = new AVLTree();
    AVLTree.Node node52 = null;
    int i53 = aVLTree51.getBalance(node52);
    AVLTree.Node node55 = aVLTree51.find((int)'4');
    aVLTree51.insert(0);
    AVLTree.Node node58 = aVLTree51.getRoot();
    AVLTree.Node node59 = aVLTree51.getRoot();
    int i60 = aVLTree22.getBalance(node59);
    int i61 = aVLTree13.getBalance(node59);
    int i62 = aVLTree0.getBalance(node59);
    aVLTree0.delete((int)'#');
    AVLTree.Node node66 = aVLTree0.find((-1));
    aVLTree0.delete((int)'4');
    AVLTree.Node node69 = null;
    int i70 = aVLTree0.getBalance(node69);
    AVLTree.Node node71 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test25"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node26 = aVLTree0.find(10);
    aVLTree0.insert((int)' ');
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.getRoot();
    int i38 = aVLTree0.getBalance(node37);
    AVLTree.Node node39 = aVLTree0.getRoot();
    AVLTree.Node node40 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test26"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    AVLTree.Node node14 = aVLTree0.getRoot();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test27"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)100);
    aVLTree0.delete((int)(byte)100);
    int i13 = aVLTree0.height();
    AVLTree.Node node15 = aVLTree0.find((int)'4');
    AVLTree.Node node17 = aVLTree0.find((int)(short)100);
    aVLTree0.delete(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test28"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    AVLTree.Node node11 = aVLTree0.getRoot();
    int i12 = aVLTree0.height();
    AVLTree.Node node14 = aVLTree0.find((-1));
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node18 = null;
    int i19 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test29"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.delete(1);
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node16 = aVLTree0.find(1);
    aVLTree0.delete((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test30"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete((int)(short)0);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree.Node node13 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test31"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    int i13 = aVLTree0.height();
    int i14 = aVLTree0.height();
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)10);
    aVLTree0.insert((int)'#');
    AVLTree.Node node21 = aVLTree0.find(0);
    aVLTree0.delete(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test32"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)0);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    int i18 = aVLTree13.height();
    aVLTree13.delete((int)(byte)1);
    aVLTree13.delete(100);
    AVLTree.Node node23 = aVLTree13.getRoot();
    aVLTree13.delete((int)(short)100);
    aVLTree13.delete(1);
    aVLTree13.delete((int)(byte)100);
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    AVLTree.Node node37 = aVLTree33.find((int)'4');
    aVLTree33.insert(0);
    AVLTree.Node node40 = aVLTree33.getRoot();
    int i41 = aVLTree30.getBalance(node40);
    AVLTree.Node node42 = aVLTree30.getRoot();
    int i43 = aVLTree30.height();
    int i44 = aVLTree30.height();
    aVLTree30.delete((int)(byte)100);
    AVLTree aVLTree47 = new AVLTree();
    AVLTree.Node node48 = null;
    int i49 = aVLTree47.getBalance(node48);
    AVLTree.Node node51 = aVLTree47.find((int)'4');
    aVLTree47.insert(0);
    aVLTree47.insert((int)(byte)10);
    AVLTree.Node node57 = aVLTree47.find((int)(short)1);
    AVLTree aVLTree58 = new AVLTree();
    AVLTree.Node node59 = null;
    int i60 = aVLTree58.getBalance(node59);
    AVLTree.Node node62 = aVLTree58.find((int)'4');
    aVLTree58.insert(0);
    AVLTree.Node node65 = aVLTree58.getRoot();
    int i66 = aVLTree58.height();
    AVLTree aVLTree67 = new AVLTree();
    AVLTree.Node node68 = null;
    int i69 = aVLTree67.getBalance(node68);
    aVLTree67.insert(0);
    AVLTree.Node node72 = aVLTree67.getRoot();
    AVLTree.Node node73 = aVLTree67.getRoot();
    int i74 = aVLTree58.getBalance(node73);
    int i75 = aVLTree47.getBalance(node73);
    AVLTree.Node node76 = aVLTree47.getRoot();
    int i77 = aVLTree30.getBalance(node76);
    int i78 = aVLTree13.getBalance(node76);
    AVLTree.Node node79 = aVLTree13.getRoot();
    int i80 = aVLTree0.getBalance(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test33"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node16 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node18 = aVLTree0.find((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test34"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    AVLTree.Node node18 = aVLTree0.find((int)(short)0);
    AVLTree.Node node19 = aVLTree0.getRoot();
    aVLTree0.delete(100);
    AVLTree.Node node23 = aVLTree0.find(0);
    AVLTree.Node node25 = aVLTree0.find(0);
    aVLTree0.insert(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test35"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)100);
    aVLTree0.insert((int)' ');
    aVLTree0.insert((int)(short)1);
    int i16 = aVLTree0.height();
    AVLTree.Node node17 = aVLTree0.getRoot();
    aVLTree0.delete((int)'a');
    aVLTree0.delete(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test36"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    aVLTree9.insert(0);
    AVLTree.Node node14 = aVLTree9.getRoot();
    AVLTree.Node node15 = aVLTree9.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    int i17 = aVLTree0.height();
    aVLTree0.delete(1);
    AVLTree.Node node20 = aVLTree0.getRoot();
    aVLTree0.delete(2);
    AVLTree.Node node24 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node25 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test37"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(100);
    AVLTree.Node node27 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test38"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)'#');
    aVLTree0.insert((int)(byte)10);
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node9 = null;
    int i10 = aVLTree0.getBalance(node9);
    aVLTree0.delete((int)(short)1);
    int i13 = aVLTree0.height();
    AVLTree aVLTree14 = new AVLTree();
    aVLTree14.insert(0);
    AVLTree.Node node18 = aVLTree14.find(100);
    AVLTree aVLTree19 = new AVLTree();
    AVLTree.Node node20 = null;
    int i21 = aVLTree19.getBalance(node20);
    aVLTree19.insert(0);
    int i24 = aVLTree19.height();
    aVLTree19.delete((int)(byte)-1);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    int i35 = aVLTree19.getBalance(node34);
    int i36 = aVLTree14.getBalance(node34);
    aVLTree14.insert((int)(short)-1);
    AVLTree aVLTree39 = new AVLTree();
    AVLTree.Node node40 = null;
    int i41 = aVLTree39.getBalance(node40);
    aVLTree39.insert(0);
    AVLTree.Node node44 = aVLTree39.getRoot();
    AVLTree.Node node45 = aVLTree39.getRoot();
    int i46 = aVLTree14.getBalance(node45);
    aVLTree14.delete(100);
    aVLTree14.insert(10);
    AVLTree aVLTree51 = new AVLTree();
    AVLTree.Node node52 = null;
    int i53 = aVLTree51.getBalance(node52);
    AVLTree.Node node55 = aVLTree51.find((int)'4');
    aVLTree51.insert(0);
    aVLTree51.insert((int)(byte)10);
    AVLTree.Node node60 = aVLTree51.getRoot();
    aVLTree51.insert((int)(short)100);
    AVLTree.Node node64 = aVLTree51.find((int)'a');
    AVLTree aVLTree65 = new AVLTree();
    AVLTree.Node node66 = null;
    int i67 = aVLTree65.getBalance(node66);
    aVLTree65.insert(0);
    AVLTree.Node node70 = aVLTree65.getRoot();
    AVLTree.Node node71 = aVLTree65.getRoot();
    AVLTree.Node node73 = aVLTree65.find((int)(short)10);
    AVLTree.Node node74 = aVLTree65.getRoot();
    int i75 = aVLTree65.height();
    AVLTree.Node node76 = aVLTree65.getRoot();
    int i77 = aVLTree51.getBalance(node76);
    int i78 = aVLTree14.getBalance(node76);
    aVLTree14.delete((int)(short)0);
    aVLTree14.delete((int)(short)100);
    aVLTree14.insert((int)(byte)100);
    AVLTree.Node node85 = aVLTree14.getRoot();
    int i86 = aVLTree0.getBalance(node85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test39"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    aVLTree12.insert(0);
    AVLTree.Node node17 = aVLTree12.getRoot();
    AVLTree.Node node18 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.find((int)(short)10);
    aVLTree12.insert((int)(byte)1);
    AVLTree.Node node23 = aVLTree12.getRoot();
    int i24 = aVLTree0.getBalance(node23);
    aVLTree0.delete((int)'#');
    AVLTree.Node node28 = aVLTree0.find((int)(short)1);
    AVLTree.Node node30 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(byte)10);
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.insert((int)'#');
    AVLTree aVLTree37 = new AVLTree();
    AVLTree.Node node38 = null;
    int i39 = aVLTree37.getBalance(node38);
    AVLTree.Node node41 = aVLTree37.find((int)'4');
    aVLTree37.insert(0);
    int i44 = aVLTree37.height();
    AVLTree.Node node46 = aVLTree37.find((int)(short)-1);
    aVLTree37.insert((int)(short)1);
    AVLTree.Node node49 = aVLTree37.getRoot();
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    aVLTree50.insert(0);
    AVLTree.Node node55 = aVLTree50.getRoot();
    int i56 = aVLTree37.getBalance(node55);
    aVLTree37.insert(10);
    AVLTree.Node node59 = aVLTree37.getRoot();
    aVLTree37.delete((int)(byte)100);
    AVLTree aVLTree62 = new AVLTree();
    AVLTree.Node node63 = null;
    int i64 = aVLTree62.getBalance(node63);
    AVLTree.Node node66 = aVLTree62.find((int)'4');
    aVLTree62.insert(0);
    AVLTree.Node node69 = aVLTree62.getRoot();
    AVLTree.Node node70 = aVLTree62.getRoot();
    aVLTree62.insert((int)(byte)1);
    AVLTree.Node node73 = aVLTree62.getRoot();
    int i74 = aVLTree37.getBalance(node73);
    int i75 = aVLTree0.getBalance(node73);
    AVLTree.Node node76 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test40"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node6 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)' ');
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree.Node node14 = aVLTree10.find((int)'4');
    aVLTree10.insert(0);
    int i17 = aVLTree10.height();
    AVLTree.Node node19 = aVLTree10.find((int)(short)-1);
    aVLTree10.insert((int)(short)1);
    AVLTree.Node node22 = aVLTree10.getRoot();
    aVLTree10.delete((int)(byte)0);
    aVLTree10.delete((int)(short)10);
    int i27 = aVLTree10.height();
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node32 = aVLTree28.find((int)'4');
    aVLTree28.insert(0);
    int i35 = aVLTree28.height();
    AVLTree.Node node37 = aVLTree28.find((int)(short)-1);
    aVLTree28.insert((int)(short)1);
    AVLTree.Node node40 = aVLTree28.getRoot();
    aVLTree28.delete((int)(byte)0);
    aVLTree28.delete((int)(short)10);
    int i45 = aVLTree28.height();
    AVLTree.Node node47 = aVLTree28.find(1);
    int i48 = aVLTree10.getBalance(node47);
    int i49 = aVLTree0.getBalance(node47);
    aVLTree0.delete(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test41"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)'4');
    AVLTree.Node node28 = aVLTree0.find(100);
    aVLTree0.delete((int)(byte)1);
    int i31 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test42"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node9 = aVLTree0.find(0);
    AVLTree.Node node11 = aVLTree0.find((int)(byte)0);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    aVLTree12.insert(0);
    AVLTree.Node node17 = aVLTree12.getRoot();
    aVLTree12.delete((int)(byte)100);
    aVLTree12.delete((int)(short)10);
    aVLTree12.delete((int)(short)0);
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree.Node node28 = aVLTree24.find((int)'4');
    aVLTree24.insert(0);
    aVLTree24.insert((int)(byte)10);
    AVLTree.Node node33 = aVLTree24.getRoot();
    aVLTree24.insert((int)(short)100);
    AVLTree.Node node37 = aVLTree24.find((int)'a');
    AVLTree.Node node38 = aVLTree24.getRoot();
    AVLTree aVLTree39 = new AVLTree();
    AVLTree.Node node40 = null;
    int i41 = aVLTree39.getBalance(node40);
    AVLTree.Node node43 = aVLTree39.find((int)'4');
    aVLTree39.insert(0);
    AVLTree.Node node46 = aVLTree39.getRoot();
    AVLTree.Node node47 = aVLTree39.getRoot();
    aVLTree39.insert((int)(byte)1);
    AVLTree.Node node50 = aVLTree39.getRoot();
    int i51 = aVLTree24.getBalance(node50);
    int i52 = aVLTree12.getBalance(node50);
    int i53 = aVLTree0.getBalance(node50);
    aVLTree0.delete((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test43"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)1);
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree0.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    aVLTree20.insert(0);
    AVLTree.Node node24 = aVLTree20.find(100);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    int i30 = aVLTree25.height();
    aVLTree25.delete((int)(byte)-1);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    AVLTree.Node node37 = aVLTree33.find((int)'4');
    aVLTree33.insert(0);
    AVLTree.Node node40 = aVLTree33.getRoot();
    int i41 = aVLTree25.getBalance(node40);
    int i42 = aVLTree20.getBalance(node40);
    aVLTree20.insert((int)(short)-1);
    AVLTree aVLTree45 = new AVLTree();
    AVLTree.Node node46 = null;
    int i47 = aVLTree45.getBalance(node46);
    AVLTree.Node node49 = aVLTree45.find((int)'4');
    aVLTree45.insert(0);
    AVLTree.Node node52 = aVLTree45.getRoot();
    int i53 = aVLTree45.height();
    AVLTree aVLTree54 = new AVLTree();
    AVLTree.Node node55 = null;
    int i56 = aVLTree54.getBalance(node55);
    AVLTree aVLTree57 = new AVLTree();
    AVLTree.Node node58 = null;
    int i59 = aVLTree57.getBalance(node58);
    AVLTree.Node node61 = aVLTree57.find((int)'4');
    aVLTree57.insert(0);
    AVLTree.Node node64 = aVLTree57.getRoot();
    int i65 = aVLTree54.getBalance(node64);
    int i66 = aVLTree45.getBalance(node64);
    int i67 = aVLTree20.getBalance(node64);
    int i68 = aVLTree0.getBalance(node64);
    int i69 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test44"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.delete((int)'#');
    int i11 = aVLTree0.height();
    AVLTree.Node node13 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test45"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    int i25 = aVLTree14.getBalance(node24);
    int i26 = aVLTree0.getBalance(node24);
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.insert(1);
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node33 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test46"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)'#');
    aVLTree0.delete((int)'a');
    AVLTree.Node node19 = aVLTree0.find((int)(byte)1);
    AVLTree aVLTree20 = new AVLTree();
    aVLTree20.insert(0);
    AVLTree.Node node23 = aVLTree20.getRoot();
    AVLTree.Node node24 = aVLTree20.getRoot();
    int i25 = aVLTree0.getBalance(node24);
    AVLTree.Node node27 = aVLTree0.find(2);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    aVLTree28.insert(0);
    AVLTree.Node node33 = aVLTree28.getRoot();
    AVLTree.Node node34 = aVLTree28.getRoot();
    AVLTree.Node node36 = aVLTree28.find((int)(short)10);
    AVLTree.Node node37 = aVLTree28.getRoot();
    int i38 = aVLTree28.height();
    AVLTree.Node node39 = aVLTree28.getRoot();
    int i40 = aVLTree28.height();
    AVLTree.Node node42 = aVLTree28.find((-1));
    aVLTree28.delete((int)(byte)10);
    AVLTree.Node node45 = aVLTree28.getRoot();
    int i46 = aVLTree0.getBalance(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test47"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test48"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)' ');
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    aVLTree8.insert(0);
    AVLTree.Node node13 = aVLTree8.getRoot();
    AVLTree.Node node14 = aVLTree8.getRoot();
    AVLTree.Node node16 = aVLTree8.find((int)(short)10);
    aVLTree8.insert((int)(byte)1);
    AVLTree.Node node19 = aVLTree8.getRoot();
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    int i27 = aVLTree20.height();
    AVLTree.Node node29 = aVLTree20.find((int)(short)-1);
    AVLTree.Node node31 = aVLTree20.find((int)'#');
    AVLTree.Node node33 = aVLTree20.find((int)(byte)-1);
    aVLTree20.delete(100);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    aVLTree36.insert(0);
    AVLTree.Node node41 = aVLTree36.getRoot();
    AVLTree.Node node42 = aVLTree36.getRoot();
    int i43 = aVLTree20.getBalance(node42);
    AVLTree.Node node45 = aVLTree20.find((int)(short)0);
    int i46 = aVLTree8.getBalance(node45);
    int i47 = aVLTree0.getBalance(node45);
    int i48 = aVLTree0.height();
    AVLTree.Node node50 = aVLTree0.find((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node50);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test49"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    int i12 = aVLTree0.height();
    int i13 = aVLTree0.height();
    aVLTree0.delete((int)(byte)10);
    aVLTree0.delete((int)'a');
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    int i25 = aVLTree18.height();
    AVLTree.Node node27 = aVLTree18.find((int)(short)-1);
    aVLTree18.insert((int)(short)1);
    aVLTree18.delete((int)(byte)0);
    aVLTree18.insert(100);
    AVLTree aVLTree34 = new AVLTree();
    AVLTree.Node node35 = null;
    int i36 = aVLTree34.getBalance(node35);
    aVLTree34.insert(0);
    AVLTree.Node node39 = aVLTree34.getRoot();
    aVLTree34.insert((int)(short)-1);
    AVLTree.Node node42 = aVLTree34.getRoot();
    int i43 = aVLTree18.getBalance(node42);
    int i44 = aVLTree0.getBalance(node42);
    aVLTree0.delete(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test50"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    int i19 = aVLTree0.getBalance(node18);
    aVLTree0.insert(10);
    AVLTree.Node node22 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    AVLTree.Node node33 = aVLTree25.getRoot();
    aVLTree25.insert((int)(byte)1);
    AVLTree.Node node36 = aVLTree25.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    int i38 = aVLTree0.height();
    int i39 = aVLTree0.height();
    aVLTree0.delete(2);
    aVLTree0.delete(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test51"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree.Node node10 = aVLTree0.find((int)(short)0);
    aVLTree0.delete((int)(short)-1);
    aVLTree0.insert(10);
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree17 = new AVLTree();
    aVLTree17.insert(0);
    AVLTree.Node node21 = aVLTree17.find(100);
    AVLTree aVLTree22 = new AVLTree();
    AVLTree.Node node23 = null;
    int i24 = aVLTree22.getBalance(node23);
    aVLTree22.insert(0);
    int i27 = aVLTree22.height();
    aVLTree22.delete((int)(byte)-1);
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree.Node node34 = aVLTree30.find((int)'4');
    aVLTree30.insert(0);
    AVLTree.Node node37 = aVLTree30.getRoot();
    int i38 = aVLTree22.getBalance(node37);
    int i39 = aVLTree17.getBalance(node37);
    aVLTree17.insert((int)(short)-1);
    AVLTree aVLTree42 = new AVLTree();
    AVLTree.Node node43 = null;
    int i44 = aVLTree42.getBalance(node43);
    aVLTree42.insert(0);
    AVLTree.Node node47 = aVLTree42.getRoot();
    AVLTree.Node node48 = aVLTree42.getRoot();
    int i49 = aVLTree17.getBalance(node48);
    int i50 = aVLTree0.getBalance(node48);
    AVLTree.Node node52 = aVLTree0.find(2);
    AVLTree aVLTree53 = new AVLTree();
    AVLTree.Node node54 = null;
    int i55 = aVLTree53.getBalance(node54);
    AVLTree.Node node57 = aVLTree53.find((int)'4');
    aVLTree53.insert(0);
    aVLTree53.insert((int)(byte)10);
    AVLTree.Node node63 = aVLTree53.find((int)(short)1);
    AVLTree.Node node65 = aVLTree53.find((int)(byte)100);
    AVLTree.Node node66 = aVLTree53.getRoot();
    AVLTree aVLTree67 = new AVLTree();
    AVLTree.Node node68 = null;
    int i69 = aVLTree67.getBalance(node68);
    AVLTree aVLTree70 = new AVLTree();
    AVLTree.Node node71 = null;
    int i72 = aVLTree70.getBalance(node71);
    AVLTree.Node node74 = aVLTree70.find((int)'4');
    aVLTree70.insert(0);
    AVLTree.Node node77 = aVLTree70.getRoot();
    int i78 = aVLTree67.getBalance(node77);
    int i79 = aVLTree53.getBalance(node77);
    int i80 = aVLTree53.height();
    int i81 = aVLTree53.height();
    aVLTree53.delete((int)(short)0);
    AVLTree.Node node84 = aVLTree53.getRoot();
    int i85 = aVLTree0.getBalance(node84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test52"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node7 = aVLTree0.find((int)(byte)100);
    aVLTree0.insert((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test53"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)(short)10);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree17.getBalance(node27);
    int i29 = aVLTree0.getBalance(node27);
    AVLTree.Node node30 = aVLTree0.getRoot();
    AVLTree.Node node32 = aVLTree0.find((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)'4');
    int i37 = aVLTree0.height();
    aVLTree0.delete((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test54"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    aVLTree9.insert(0);
    AVLTree.Node node14 = aVLTree9.getRoot();
    AVLTree.Node node15 = aVLTree9.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    int i17 = aVLTree0.height();
    int i18 = aVLTree0.height();
    int i19 = aVLTree0.height();
    aVLTree0.delete(1);
    AVLTree aVLTree22 = new AVLTree();
    aVLTree22.delete((int)(short)1);
    AVLTree.Node node26 = aVLTree22.find((int)'#');
    aVLTree22.insert((int)(byte)10);
    aVLTree22.delete((int)(byte)100);
    AVLTree.Node node32 = aVLTree22.find((-1));
    AVLTree.Node node33 = aVLTree22.getRoot();
    int i34 = aVLTree0.getBalance(node33);
    aVLTree0.delete((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test55"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)(short)10);
    int i17 = aVLTree0.height();
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    int i25 = aVLTree18.height();
    AVLTree.Node node27 = aVLTree18.find((int)(short)-1);
    aVLTree18.insert((int)(short)1);
    AVLTree.Node node30 = aVLTree18.getRoot();
    aVLTree18.delete((int)(byte)0);
    aVLTree18.delete((int)(short)10);
    int i35 = aVLTree18.height();
    AVLTree.Node node37 = aVLTree18.find(1);
    int i38 = aVLTree0.getBalance(node37);
    AVLTree aVLTree39 = new AVLTree();
    AVLTree.Node node40 = null;
    int i41 = aVLTree39.getBalance(node40);
    AVLTree.Node node43 = aVLTree39.find((int)'4');
    aVLTree39.insert(0);
    int i46 = aVLTree39.height();
    AVLTree.Node node48 = aVLTree39.find((int)(short)-1);
    aVLTree39.insert((int)(short)1);
    AVLTree.Node node51 = aVLTree39.getRoot();
    AVLTree aVLTree52 = new AVLTree();
    AVLTree.Node node53 = null;
    int i54 = aVLTree52.getBalance(node53);
    aVLTree52.insert(0);
    AVLTree.Node node57 = aVLTree52.getRoot();
    int i58 = aVLTree39.getBalance(node57);
    int i59 = aVLTree0.getBalance(node57);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test56"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    aVLTree0.insert(1);
    AVLTree.Node node25 = aVLTree0.find((int)'#');
    AVLTree.Node node27 = aVLTree0.find((int)(short)1);
    AVLTree.Node node29 = aVLTree0.find((int)(short)10);
    aVLTree0.delete((int)(short)10);
    int i32 = aVLTree0.height();
    AVLTree.Node node33 = aVLTree0.getRoot();
    AVLTree.Node node34 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test57"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node13 = aVLTree0.find((int)'a');
    AVLTree.Node node14 = aVLTree0.getRoot();
    AVLTree aVLTree15 = new AVLTree();
    AVLTree.Node node16 = null;
    int i17 = aVLTree15.getBalance(node16);
    AVLTree.Node node19 = aVLTree15.find((int)'4');
    aVLTree15.insert(0);
    AVLTree.Node node22 = aVLTree15.getRoot();
    AVLTree.Node node23 = aVLTree15.getRoot();
    aVLTree15.insert((int)(byte)1);
    AVLTree.Node node26 = aVLTree15.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    int i28 = aVLTree0.height();
    int i29 = aVLTree0.height();
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    AVLTree.Node node37 = aVLTree33.find((int)'4');
    aVLTree33.insert(0);
    AVLTree.Node node40 = aVLTree33.getRoot();
    int i41 = aVLTree30.getBalance(node40);
    AVLTree aVLTree42 = new AVLTree();
    AVLTree.Node node43 = null;
    int i44 = aVLTree42.getBalance(node43);
    aVLTree42.insert(0);
    AVLTree.Node node47 = aVLTree42.getRoot();
    aVLTree42.delete((int)(byte)100);
    aVLTree42.delete((int)(short)10);
    aVLTree42.delete((int)(short)0);
    aVLTree42.delete((int)'4');
    AVLTree aVLTree56 = new AVLTree();
    AVLTree.Node node57 = null;
    int i58 = aVLTree56.getBalance(node57);
    AVLTree.Node node60 = aVLTree56.find((int)'4');
    aVLTree56.insert(0);
    int i63 = aVLTree56.height();
    AVLTree.Node node65 = aVLTree56.find((int)(short)-1);
    aVLTree56.insert((int)(short)1);
    AVLTree.Node node68 = aVLTree56.getRoot();
    AVLTree aVLTree69 = new AVLTree();
    AVLTree.Node node70 = null;
    int i71 = aVLTree69.getBalance(node70);
    aVLTree69.insert(0);
    AVLTree.Node node74 = aVLTree69.getRoot();
    int i75 = aVLTree56.getBalance(node74);
    aVLTree56.insert(10);
    AVLTree.Node node78 = aVLTree56.getRoot();
    int i79 = aVLTree42.getBalance(node78);
    int i80 = aVLTree30.getBalance(node78);
    int i81 = aVLTree0.getBalance(node78);
    AVLTree.Node node83 = aVLTree0.find((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node83);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test58"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree5.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    AVLTree.Node node25 = aVLTree17.getRoot();
    int i26 = aVLTree5.getBalance(node25);
    int i27 = aVLTree0.getBalance(node25);
    aVLTree0.insert((int)(byte)100);
    AVLTree.Node node31 = aVLTree0.find((int)'4');
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)100);
    AVLTree.Node node36 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test59"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    int i8 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    int i11 = aVLTree0.height();
    aVLTree0.insert((int)'a');
    int i14 = aVLTree0.height();
    AVLTree.Node node16 = aVLTree0.find(100);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    int i24 = aVLTree17.height();
    AVLTree.Node node26 = aVLTree17.find((int)(short)-1);
    aVLTree17.insert((int)(short)1);
    AVLTree.Node node29 = aVLTree17.getRoot();
    aVLTree17.delete((int)(byte)0);
    AVLTree.Node node32 = aVLTree17.getRoot();
    int i33 = aVLTree0.getBalance(node32);
    AVLTree.Node node35 = aVLTree0.find((int)'#');
    aVLTree0.insert(10);
    AVLTree.Node node39 = aVLTree0.find((int)(short)0);
    AVLTree.Node node40 = aVLTree0.getRoot();
    AVLTree.Node node42 = aVLTree0.find((int)(byte)10);
    AVLTree.Node node44 = aVLTree0.find((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test60"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    aVLTree9.insert(0);
    AVLTree.Node node14 = aVLTree9.getRoot();
    AVLTree.Node node15 = aVLTree9.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    AVLTree.Node node17 = aVLTree0.getRoot();
    int i18 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test61"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree6 = new AVLTree();
    AVLTree.Node node7 = null;
    int i8 = aVLTree6.getBalance(node7);
    aVLTree6.insert(0);
    AVLTree.Node node11 = aVLTree6.getRoot();
    AVLTree.Node node12 = aVLTree6.getRoot();
    AVLTree.Node node14 = aVLTree6.find((int)(short)10);
    AVLTree.Node node15 = aVLTree6.getRoot();
    AVLTree.Node node16 = aVLTree6.getRoot();
    int i17 = aVLTree0.getBalance(node16);
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    aVLTree18.insert(0);
    int i23 = aVLTree18.height();
    aVLTree18.delete((int)(byte)-1);
    int i26 = aVLTree18.height();
    aVLTree18.delete((int)(short)1);
    int i29 = aVLTree18.height();
    aVLTree18.insert((int)'a');
    int i32 = aVLTree18.height();
    AVLTree.Node node34 = aVLTree18.find(100);
    AVLTree.Node node35 = aVLTree18.getRoot();
    int i36 = aVLTree0.getBalance(node35);
    AVLTree aVLTree37 = new AVLTree();
    AVLTree.Node node38 = null;
    int i39 = aVLTree37.getBalance(node38);
    aVLTree37.insert(0);
    int i42 = aVLTree37.height();
    aVLTree37.delete((int)(byte)-1);
    AVLTree aVLTree45 = new AVLTree();
    AVLTree.Node node46 = null;
    int i47 = aVLTree45.getBalance(node46);
    AVLTree.Node node49 = aVLTree45.find((int)'4');
    aVLTree45.insert(0);
    aVLTree45.insert((int)(byte)10);
    AVLTree.Node node55 = aVLTree45.find((int)(short)1);
    AVLTree.Node node56 = aVLTree45.getRoot();
    int i57 = aVLTree37.getBalance(node56);
    int i58 = aVLTree37.height();
    AVLTree aVLTree59 = new AVLTree();
    AVLTree.Node node60 = null;
    int i61 = aVLTree59.getBalance(node60);
    AVLTree.Node node63 = aVLTree59.find((int)'4');
    aVLTree59.insert(0);
    AVLTree.Node node66 = aVLTree59.getRoot();
    int i67 = aVLTree59.height();
    AVLTree aVLTree68 = new AVLTree();
    AVLTree.Node node69 = null;
    int i70 = aVLTree68.getBalance(node69);
    AVLTree aVLTree71 = new AVLTree();
    AVLTree.Node node72 = null;
    int i73 = aVLTree71.getBalance(node72);
    AVLTree.Node node75 = aVLTree71.find((int)'4');
    aVLTree71.insert(0);
    AVLTree.Node node78 = aVLTree71.getRoot();
    int i79 = aVLTree68.getBalance(node78);
    int i80 = aVLTree59.getBalance(node78);
    int i81 = aVLTree37.getBalance(node78);
    AVLTree.Node node82 = aVLTree37.getRoot();
    int i83 = aVLTree0.getBalance(node82);
    int i84 = aVLTree0.height();
    aVLTree0.insert((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test62"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)'4');
    AVLTree.Node node28 = aVLTree0.find(100);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node32 = aVLTree0.find((int)(short)1);
    int i33 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test63"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node18 = aVLTree0.find(0);
    int i19 = aVLTree0.height();
    AVLTree.Node node21 = aVLTree0.find((int)(byte)-1);
    AVLTree.Node node22 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test64"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    int i16 = aVLTree0.height();
    int i17 = aVLTree0.height();
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    AVLTree.Node node25 = aVLTree18.getRoot();
    AVLTree.Node node26 = aVLTree18.getRoot();
    int i27 = aVLTree18.height();
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    int i39 = aVLTree28.getBalance(node38);
    int i40 = aVLTree18.getBalance(node38);
    aVLTree18.delete((int)(short)10);
    AVLTree.Node node43 = aVLTree18.getRoot();
    int i44 = aVLTree0.getBalance(node43);
    AVLTree.Node node46 = aVLTree0.find(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node46);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test65"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    aVLTree12.insert(0);
    AVLTree.Node node17 = aVLTree12.getRoot();
    AVLTree.Node node18 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.find((int)(short)10);
    aVLTree12.insert((int)(byte)1);
    AVLTree.Node node23 = aVLTree12.getRoot();
    int i24 = aVLTree0.getBalance(node23);
    aVLTree0.delete((int)'#');
    AVLTree.Node node28 = aVLTree0.find((int)(byte)10);
    aVLTree0.delete((int)'4');
    AVLTree.Node node32 = aVLTree0.find((-1));
    int i33 = aVLTree0.height();
    AVLTree aVLTree34 = new AVLTree();
    AVLTree.Node node35 = null;
    int i36 = aVLTree34.getBalance(node35);
    AVLTree.Node node38 = aVLTree34.find((int)'4');
    aVLTree34.insert(0);
    aVLTree34.insert((int)(byte)10);
    AVLTree.Node node43 = aVLTree34.getRoot();
    aVLTree34.insert((int)(short)100);
    AVLTree.Node node47 = aVLTree34.find((int)'a');
    AVLTree aVLTree48 = new AVLTree();
    AVLTree.Node node49 = null;
    int i50 = aVLTree48.getBalance(node49);
    aVLTree48.insert(0);
    AVLTree.Node node53 = aVLTree48.getRoot();
    AVLTree.Node node54 = aVLTree48.getRoot();
    AVLTree.Node node56 = aVLTree48.find((int)(short)10);
    AVLTree.Node node57 = aVLTree48.getRoot();
    int i58 = aVLTree48.height();
    AVLTree.Node node59 = aVLTree48.getRoot();
    int i60 = aVLTree34.getBalance(node59);
    aVLTree34.insert((int)(byte)-1);
    AVLTree.Node node64 = aVLTree34.find((int)(byte)100);
    int i65 = aVLTree0.getBalance(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test66"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)(byte)1);
    AVLTree.Node node11 = aVLTree0.getRoot();
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    int i19 = aVLTree12.height();
    AVLTree.Node node21 = aVLTree12.find((int)(short)-1);
    AVLTree.Node node23 = aVLTree12.find((int)'#');
    AVLTree.Node node25 = aVLTree12.find((int)(byte)-1);
    aVLTree12.delete(100);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    aVLTree28.insert(0);
    AVLTree.Node node33 = aVLTree28.getRoot();
    AVLTree.Node node34 = aVLTree28.getRoot();
    int i35 = aVLTree12.getBalance(node34);
    AVLTree.Node node37 = aVLTree12.find((int)(short)0);
    int i38 = aVLTree0.getBalance(node37);
    AVLTree.Node node39 = aVLTree0.getRoot();
    int i40 = aVLTree0.height();
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    int i48 = aVLTree41.height();
    AVLTree.Node node50 = aVLTree41.find((int)(short)-1);
    AVLTree.Node node52 = aVLTree41.find((int)'#');
    AVLTree.Node node54 = aVLTree41.find((int)(byte)-1);
    aVLTree41.insert((int)(short)100);
    int i57 = aVLTree41.height();
    AVLTree.Node node58 = aVLTree41.getRoot();
    int i59 = aVLTree0.getBalance(node58);
    aVLTree0.delete((int)(short)-1);
    aVLTree0.insert((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test67"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree10.getBalance(node18);
    int i20 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)(short)10);
    AVLTree.Node node26 = aVLTree0.find((int)(short)100);
    int i27 = aVLTree0.height();
    AVLTree.Node node29 = aVLTree0.find((-1));
    AVLTree.Node node30 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test68"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    AVLTree.Node node25 = aVLTree0.getRoot();
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree.Node node30 = aVLTree26.find((int)'4');
    aVLTree26.insert(0);
    AVLTree.Node node33 = aVLTree26.getRoot();
    AVLTree.Node node34 = aVLTree26.getRoot();
    int i35 = aVLTree26.height();
    AVLTree aVLTree36 = new AVLTree();
    AVLTree aVLTree37 = new AVLTree();
    AVLTree.Node node38 = null;
    int i39 = aVLTree37.getBalance(node38);
    AVLTree.Node node41 = aVLTree37.find((int)'4');
    aVLTree37.insert(0);
    AVLTree.Node node44 = aVLTree37.getRoot();
    int i45 = aVLTree36.getBalance(node44);
    int i46 = aVLTree26.getBalance(node44);
    aVLTree26.insert((int)(short)-1);
    AVLTree.Node node49 = aVLTree26.getRoot();
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    AVLTree aVLTree53 = new AVLTree();
    AVLTree.Node node54 = null;
    int i55 = aVLTree53.getBalance(node54);
    AVLTree.Node node57 = aVLTree53.find((int)'4');
    aVLTree53.insert(0);
    AVLTree.Node node60 = aVLTree53.getRoot();
    int i61 = aVLTree50.getBalance(node60);
    AVLTree aVLTree62 = new AVLTree();
    AVLTree.Node node63 = null;
    int i64 = aVLTree62.getBalance(node63);
    AVLTree.Node node66 = aVLTree62.find((int)'4');
    aVLTree62.insert(0);
    AVLTree.Node node69 = aVLTree62.getRoot();
    AVLTree.Node node70 = aVLTree62.getRoot();
    int i71 = aVLTree50.getBalance(node70);
    int i72 = aVLTree26.getBalance(node70);
    aVLTree26.insert((int)(short)100);
    AVLTree.Node node75 = aVLTree26.getRoot();
    int i76 = aVLTree0.getBalance(node75);
    AVLTree.Node node77 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node77);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test69"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)'#');
    aVLTree0.delete(0);
    AVLTree.Node node19 = aVLTree0.find((int)(byte)10);
    aVLTree0.delete((int)'a');
    aVLTree0.insert(2);
    aVLTree0.insert((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test70"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    int i9 = aVLTree0.height();
    aVLTree0.insert(10);
    AVLTree.Node node13 = aVLTree0.find((int)(byte)1);
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    aVLTree14.insert(0);
    AVLTree.Node node21 = aVLTree14.getRoot();
    int i22 = aVLTree14.height();
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree.Node node30 = aVLTree26.find((int)'4');
    aVLTree26.insert(0);
    AVLTree.Node node33 = aVLTree26.getRoot();
    int i34 = aVLTree23.getBalance(node33);
    int i35 = aVLTree14.getBalance(node33);
    aVLTree14.delete((int)(byte)0);
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree.Node node42 = aVLTree38.find((int)'4');
    aVLTree38.insert(0);
    aVLTree38.insert((int)(byte)10);
    AVLTree.Node node47 = aVLTree38.getRoot();
    aVLTree38.insert((int)(short)100);
    AVLTree.Node node51 = aVLTree38.find((int)'a');
    AVLTree aVLTree52 = new AVLTree();
    AVLTree.Node node53 = null;
    int i54 = aVLTree52.getBalance(node53);
    aVLTree52.insert(0);
    AVLTree.Node node57 = aVLTree52.getRoot();
    AVLTree.Node node58 = aVLTree52.getRoot();
    AVLTree.Node node60 = aVLTree52.find((int)(short)10);
    AVLTree.Node node61 = aVLTree52.getRoot();
    int i62 = aVLTree52.height();
    AVLTree.Node node63 = aVLTree52.getRoot();
    int i64 = aVLTree38.getBalance(node63);
    int i65 = aVLTree14.getBalance(node63);
    int i66 = aVLTree0.getBalance(node63);
    AVLTree.Node node67 = null;
    int i68 = aVLTree0.getBalance(node67);
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node71 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test71"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    int i15 = aVLTree8.height();
    AVLTree.Node node17 = aVLTree8.find((int)(short)-1);
    AVLTree.Node node19 = aVLTree8.find((int)' ');
    AVLTree.Node node20 = aVLTree8.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    AVLTree aVLTree22 = new AVLTree();
    AVLTree.Node node23 = null;
    int i24 = aVLTree22.getBalance(node23);
    aVLTree22.insert(0);
    AVLTree.Node node27 = aVLTree22.getRoot();
    AVLTree.Node node28 = aVLTree22.getRoot();
    AVLTree.Node node30 = aVLTree22.find((int)(short)10);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    AVLTree.Node node39 = aVLTree31.getRoot();
    int i40 = aVLTree31.height();
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    AVLTree.Node node48 = aVLTree44.find((int)'4');
    aVLTree44.insert(0);
    AVLTree.Node node51 = aVLTree44.getRoot();
    int i52 = aVLTree41.getBalance(node51);
    int i53 = aVLTree31.getBalance(node51);
    aVLTree31.delete((int)(short)10);
    aVLTree31.delete(100);
    AVLTree aVLTree58 = new AVLTree();
    AVLTree.Node node59 = null;
    int i60 = aVLTree58.getBalance(node59);
    AVLTree.Node node62 = aVLTree58.find((int)'4');
    aVLTree58.insert(0);
    aVLTree58.insert((int)(byte)10);
    AVLTree.Node node67 = aVLTree58.getRoot();
    int i68 = aVLTree31.getBalance(node67);
    int i69 = aVLTree22.getBalance(node67);
    int i70 = aVLTree0.getBalance(node67);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test72"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree11.height();
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    aVLTree20.insert(0);
    AVLTree.Node node25 = aVLTree20.getRoot();
    AVLTree.Node node26 = aVLTree20.getRoot();
    int i27 = aVLTree11.getBalance(node26);
    int i28 = aVLTree0.getBalance(node26);
    AVLTree.Node node29 = aVLTree0.getRoot();
    AVLTree aVLTree30 = new AVLTree();
    aVLTree30.insert(0);
    AVLTree.Node node33 = aVLTree30.getRoot();
    aVLTree30.delete((int)(byte)100);
    aVLTree30.insert((int)(short)-1);
    AVLTree.Node node38 = aVLTree30.getRoot();
    int i39 = aVLTree0.getBalance(node38);
    AVLTree.Node node40 = aVLTree0.getRoot();
    int i41 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test73"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(10);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree.Node node13 = aVLTree9.find((int)'4');
    aVLTree9.insert(0);
    AVLTree.Node node16 = aVLTree9.getRoot();
    int i17 = aVLTree9.height();
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree aVLTree21 = new AVLTree();
    AVLTree.Node node22 = null;
    int i23 = aVLTree21.getBalance(node22);
    AVLTree.Node node25 = aVLTree21.find((int)'4');
    aVLTree21.insert(0);
    AVLTree.Node node28 = aVLTree21.getRoot();
    int i29 = aVLTree18.getBalance(node28);
    int i30 = aVLTree9.getBalance(node28);
    aVLTree9.delete((int)(byte)0);
    int i33 = aVLTree9.height();
    AVLTree aVLTree34 = new AVLTree();
    AVLTree.Node node35 = null;
    int i36 = aVLTree34.getBalance(node35);
    aVLTree34.insert(0);
    int i39 = aVLTree34.height();
    AVLTree aVLTree40 = new AVLTree();
    AVLTree.Node node41 = null;
    int i42 = aVLTree40.getBalance(node41);
    AVLTree.Node node44 = aVLTree40.find((int)'4');
    aVLTree40.insert(0);
    aVLTree40.insert((int)(byte)10);
    AVLTree.Node node50 = aVLTree40.find((int)(short)1);
    AVLTree.Node node52 = aVLTree40.find((int)(byte)100);
    int i53 = aVLTree40.height();
    AVLTree.Node node54 = aVLTree40.getRoot();
    int i55 = aVLTree34.getBalance(node54);
    int i56 = aVLTree9.getBalance(node54);
    int i57 = aVLTree0.getBalance(node54);
    aVLTree0.delete((int)' ');
    AVLTree.Node node61 = aVLTree0.find((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node61);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test74"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)1);
    int i29 = aVLTree0.height();
    aVLTree0.insert((int)(byte)1);
    int i32 = aVLTree0.height();
    int i33 = aVLTree0.height();
    AVLTree.Node node34 = aVLTree0.getRoot();
    AVLTree.Node node36 = aVLTree0.find(2);
    aVLTree0.delete((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test75"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    aVLTree0.insert(1);
    AVLTree.Node node25 = aVLTree0.find((int)'#');
    AVLTree.Node node27 = aVLTree0.find((int)(short)1);
    aVLTree0.insert((int)(byte)10);
    int i30 = aVLTree0.height();
    AVLTree.Node node32 = aVLTree0.find(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test76"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.insert(2);
    AVLTree aVLTree6 = new AVLTree();
    AVLTree.Node node7 = null;
    int i8 = aVLTree6.getBalance(node7);
    AVLTree.Node node10 = aVLTree6.find((int)'4');
    aVLTree6.insert(0);
    int i13 = aVLTree6.height();
    AVLTree.Node node15 = aVLTree6.find((int)(short)-1);
    aVLTree6.insert((int)(short)1);
    AVLTree.Node node18 = aVLTree6.getRoot();
    aVLTree6.delete((int)' ');
    AVLTree aVLTree21 = new AVLTree();
    AVLTree.Node node22 = null;
    int i23 = aVLTree21.getBalance(node22);
    AVLTree.Node node25 = aVLTree21.find((int)'4');
    aVLTree21.insert(0);
    int i28 = aVLTree21.height();
    AVLTree.Node node30 = aVLTree21.find((int)(short)-1);
    aVLTree21.insert((int)(short)1);
    AVLTree.Node node33 = aVLTree21.getRoot();
    AVLTree aVLTree34 = new AVLTree();
    AVLTree.Node node35 = null;
    int i36 = aVLTree34.getBalance(node35);
    aVLTree34.insert(0);
    AVLTree.Node node39 = aVLTree34.getRoot();
    int i40 = aVLTree21.getBalance(node39);
    int i41 = aVLTree6.getBalance(node39);
    AVLTree aVLTree42 = new AVLTree();
    AVLTree.Node node43 = null;
    int i44 = aVLTree42.getBalance(node43);
    AVLTree.Node node46 = aVLTree42.find((int)'4');
    aVLTree42.insert(0);
    AVLTree.Node node49 = aVLTree42.getRoot();
    AVLTree.Node node50 = aVLTree42.getRoot();
    int i51 = aVLTree42.height();
    AVLTree aVLTree52 = new AVLTree();
    AVLTree.Node node53 = null;
    int i54 = aVLTree52.getBalance(node53);
    AVLTree aVLTree55 = new AVLTree();
    AVLTree.Node node56 = null;
    int i57 = aVLTree55.getBalance(node56);
    AVLTree.Node node59 = aVLTree55.find((int)'4');
    aVLTree55.insert(0);
    AVLTree.Node node62 = aVLTree55.getRoot();
    int i63 = aVLTree52.getBalance(node62);
    int i64 = aVLTree42.getBalance(node62);
    aVLTree42.delete((int)(short)10);
    aVLTree42.delete(100);
    AVLTree aVLTree69 = new AVLTree();
    AVLTree.Node node70 = null;
    int i71 = aVLTree69.getBalance(node70);
    AVLTree.Node node73 = aVLTree69.find((int)'4');
    aVLTree69.insert(0);
    aVLTree69.insert((int)(byte)10);
    AVLTree.Node node78 = aVLTree69.getRoot();
    int i79 = aVLTree42.getBalance(node78);
    int i80 = aVLTree42.height();
    aVLTree42.delete((int)(short)1);
    AVLTree.Node node83 = aVLTree42.getRoot();
    int i84 = aVLTree6.getBalance(node83);
    AVLTree.Node node86 = aVLTree6.find(0);
    int i87 = aVLTree0.getBalance(node86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test77"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    aVLTree10.insert(0);
    AVLTree.Node node13 = aVLTree10.getRoot();
    aVLTree10.delete((int)(byte)100);
    aVLTree10.delete((int)' ');
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    aVLTree18.insert(0);
    AVLTree.Node node23 = aVLTree18.getRoot();
    AVLTree.Node node24 = aVLTree18.getRoot();
    AVLTree.Node node26 = aVLTree18.find((int)(short)10);
    aVLTree18.insert((int)(byte)1);
    AVLTree.Node node29 = aVLTree18.getRoot();
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree.Node node34 = aVLTree30.find((int)'4');
    aVLTree30.insert(0);
    int i37 = aVLTree30.height();
    AVLTree.Node node39 = aVLTree30.find((int)(short)-1);
    AVLTree.Node node41 = aVLTree30.find((int)'#');
    AVLTree.Node node43 = aVLTree30.find((int)(byte)-1);
    aVLTree30.delete(100);
    AVLTree aVLTree46 = new AVLTree();
    AVLTree.Node node47 = null;
    int i48 = aVLTree46.getBalance(node47);
    aVLTree46.insert(0);
    AVLTree.Node node51 = aVLTree46.getRoot();
    AVLTree.Node node52 = aVLTree46.getRoot();
    int i53 = aVLTree30.getBalance(node52);
    AVLTree.Node node55 = aVLTree30.find((int)(short)0);
    int i56 = aVLTree18.getBalance(node55);
    int i57 = aVLTree10.getBalance(node55);
    int i58 = aVLTree0.getBalance(node55);
    aVLTree0.insert((int)(byte)100);
    aVLTree0.insert((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test78"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    AVLTree.Node node11 = aVLTree0.find(0);
    int i12 = aVLTree0.height();
    aVLTree0.insert((int)(byte)1);
    aVLTree0.insert(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test79"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    int i14 = aVLTree0.height();
    AVLTree.Node node16 = aVLTree0.find(2);
    int i17 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    AVLTree aVLTree20 = new AVLTree();
    aVLTree20.delete((int)(short)1);
    AVLTree.Node node24 = aVLTree20.find((int)(byte)0);
    int i25 = aVLTree20.height();
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree.Node node30 = aVLTree26.find((int)'4');
    aVLTree26.insert(0);
    AVLTree.Node node33 = aVLTree26.getRoot();
    AVLTree.Node node34 = aVLTree26.getRoot();
    aVLTree26.insert((int)(byte)1);
    aVLTree26.delete(100);
    AVLTree.Node node39 = aVLTree26.getRoot();
    int i40 = aVLTree20.getBalance(node39);
    int i41 = aVLTree0.getBalance(node39);
    aVLTree0.delete((int)(byte)1);
    AVLTree.Node node44 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node44);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test80"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    int i8 = aVLTree0.height();
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)-1);
    AVLTree.Node node14 = aVLTree0.find((int)(short)100);
    aVLTree0.delete((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test81"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.delete((int)'#');
    AVLTree.Node node12 = aVLTree0.find(2);
    aVLTree0.delete((-1));
    aVLTree0.insert((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test82"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test83"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    int i16 = aVLTree0.height();
    aVLTree0.delete(100);
    AVLTree.Node node19 = aVLTree0.getRoot();
    int i20 = aVLTree0.height();
    aVLTree0.delete((int)(short)0);
    AVLTree.Node node24 = aVLTree0.find((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test84"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    aVLTree0.insert(1);
    AVLTree.Node node25 = aVLTree0.find((int)'#');
    AVLTree.Node node27 = aVLTree0.find((int)(short)1);
    AVLTree.Node node29 = aVLTree0.find((int)(short)10);
    AVLTree.Node node30 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test85"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    int i12 = aVLTree0.height();
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node15 = aVLTree0.getRoot();
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    AVLTree.Node node24 = aVLTree16.find((int)(short)10);
    AVLTree.Node node25 = aVLTree16.getRoot();
    AVLTree.Node node26 = aVLTree16.getRoot();
    aVLTree16.delete((int)(byte)10);
    AVLTree.Node node29 = aVLTree16.getRoot();
    AVLTree.Node node30 = aVLTree16.getRoot();
    int i31 = aVLTree0.getBalance(node30);
    AVLTree aVLTree32 = new AVLTree();
    AVLTree.Node node33 = null;
    int i34 = aVLTree32.getBalance(node33);
    AVLTree.Node node36 = aVLTree32.find((int)'4');
    aVLTree32.insert(0);
    aVLTree32.insert((int)(byte)10);
    AVLTree.Node node42 = aVLTree32.find((int)(short)1);
    AVLTree.Node node44 = aVLTree32.find((int)(byte)100);
    AVLTree.Node node45 = aVLTree32.getRoot();
    AVLTree aVLTree46 = new AVLTree();
    AVLTree.Node node47 = null;
    int i48 = aVLTree46.getBalance(node47);
    AVLTree aVLTree49 = new AVLTree();
    AVLTree.Node node50 = null;
    int i51 = aVLTree49.getBalance(node50);
    AVLTree.Node node53 = aVLTree49.find((int)'4');
    aVLTree49.insert(0);
    AVLTree.Node node56 = aVLTree49.getRoot();
    int i57 = aVLTree46.getBalance(node56);
    int i58 = aVLTree32.getBalance(node56);
    int i59 = aVLTree32.height();
    int i60 = aVLTree32.height();
    aVLTree32.delete((int)(short)0);
    AVLTree.Node node63 = aVLTree32.getRoot();
    int i64 = aVLTree0.getBalance(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test86"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    aVLTree0.delete((int)(short)-1);
    aVLTree0.delete((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test87"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert((int)(short)100);
    int i3 = aVLTree0.height();
    aVLTree0.insert((int)(byte)1);
    int i6 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test88"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(100);
    AVLTree.Node node10 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)100);
    int i13 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test89"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    int i23 = aVLTree0.getBalance(node22);
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree26 = new AVLTree();
    aVLTree26.delete((int)(short)1);
    AVLTree.Node node30 = aVLTree26.find((int)(byte)0);
    int i31 = aVLTree26.height();
    AVLTree aVLTree32 = new AVLTree();
    AVLTree.Node node33 = null;
    int i34 = aVLTree32.getBalance(node33);
    AVLTree.Node node36 = aVLTree32.find((int)'4');
    aVLTree32.insert(0);
    AVLTree.Node node39 = aVLTree32.getRoot();
    AVLTree.Node node40 = aVLTree32.getRoot();
    aVLTree32.insert((int)(byte)1);
    aVLTree32.delete(100);
    AVLTree.Node node45 = aVLTree32.getRoot();
    int i46 = aVLTree26.getBalance(node45);
    int i47 = aVLTree26.height();
    aVLTree26.delete((int)(short)-1);
    aVLTree26.insert((int)'a');
    AVLTree.Node node52 = aVLTree26.getRoot();
    int i53 = aVLTree0.getBalance(node52);
    AVLTree.Node node54 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test90"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    int i25 = aVLTree14.getBalance(node24);
    int i26 = aVLTree0.getBalance(node24);
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.insert(1);
    int i31 = aVLTree0.height();
    aVLTree0.delete((-1));
    AVLTree.Node node35 = aVLTree0.find((int)(byte)10);
    AVLTree.Node node36 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test91"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    AVLTree.Node node12 = aVLTree0.find((int)'4');
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    aVLTree14.insert(0);
    int i21 = aVLTree14.height();
    AVLTree.Node node23 = aVLTree14.find((int)(short)-1);
    aVLTree14.insert((int)(short)1);
    aVLTree14.delete((int)(byte)0);
    AVLTree.Node node28 = aVLTree14.getRoot();
    int i29 = aVLTree0.getBalance(node28);
    aVLTree0.delete((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test92"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)'4');
    aVLTree0.insert((-1));
    aVLTree0.delete((int)(short)10);
    AVLTree.Node node19 = aVLTree0.find((int)' ');
    aVLTree0.insert((int)'a');
    AVLTree.Node node23 = aVLTree0.find(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test93"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    int i10 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    aVLTree13.insert((int)(short)1);
    aVLTree13.delete((int)(byte)0);
    AVLTree.Node node27 = aVLTree13.getRoot();
    int i28 = aVLTree0.getBalance(node27);
    aVLTree0.insert((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test94"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node13 = aVLTree0.find((int)'a');
    AVLTree.Node node14 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.getRoot();
    AVLTree.Node node17 = aVLTree0.find(100);
    AVLTree.Node node19 = aVLTree0.find(1);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    int i27 = aVLTree20.height();
    AVLTree.Node node29 = aVLTree20.find((int)(short)-1);
    aVLTree20.insert((int)(short)1);
    aVLTree20.delete((int)(byte)0);
    int i34 = aVLTree20.height();
    AVLTree.Node node35 = aVLTree20.getRoot();
    int i36 = aVLTree0.getBalance(node35);
    AVLTree.Node node38 = aVLTree0.find((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);

  }

  @Test
  public void test95() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test95"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    int i10 = aVLTree3.height();
    AVLTree.Node node12 = aVLTree3.find((int)(short)-1);
    AVLTree.Node node14 = aVLTree3.find((int)'#');
    AVLTree.Node node16 = aVLTree3.find((int)(byte)-1);
    aVLTree3.delete(100);
    AVLTree.Node node19 = aVLTree3.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    int i21 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node24 = null;
    int i25 = aVLTree0.getBalance(node24);
    AVLTree.Node node27 = aVLTree0.find((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);

  }

  @Test
  public void test96() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test96"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);

  }

  @Test
  public void test97() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test97"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)10);
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree.Node node14 = aVLTree10.find((int)'4');
    aVLTree10.insert(0);
    int i17 = aVLTree10.height();
    AVLTree.Node node19 = aVLTree10.find((int)(short)-1);
    aVLTree10.insert((int)(short)1);
    AVLTree.Node node22 = aVLTree10.getRoot();
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    aVLTree23.insert(0);
    AVLTree.Node node28 = aVLTree23.getRoot();
    int i29 = aVLTree10.getBalance(node28);
    aVLTree10.insert(10);
    AVLTree.Node node32 = aVLTree10.getRoot();
    aVLTree10.delete((int)(byte)100);
    AVLTree aVLTree35 = new AVLTree();
    AVLTree.Node node36 = null;
    int i37 = aVLTree35.getBalance(node36);
    AVLTree.Node node39 = aVLTree35.find((int)'4');
    aVLTree35.insert(0);
    AVLTree.Node node42 = aVLTree35.getRoot();
    AVLTree.Node node43 = aVLTree35.getRoot();
    aVLTree35.insert((int)(byte)1);
    AVLTree.Node node46 = aVLTree35.getRoot();
    int i47 = aVLTree10.getBalance(node46);
    AVLTree.Node node48 = aVLTree10.getRoot();
    int i49 = aVLTree0.getBalance(node48);
    AVLTree.Node node50 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);

  }

}
