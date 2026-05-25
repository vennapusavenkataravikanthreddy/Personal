import { test, expect } from '@playwright/test';
import { HomePage } from '../pages/HomePage';
import { ProductPage } from '../pages/ProductPage';
import { readExcelData } from '../utils/excelReader';
import { writeReport } from '../utils/reportWriter';

test.describe('E-commerce Tests', () => {
  let homePage: HomePage;
  let productPage: ProductPage;

  test.beforeEach(async ({ page }) => {
    homePage = new HomePage(page);
    productPage = new ProductPage(page);
  });

  test('Add product to cart', async ({ page }) => {
    const testData = await readExcelData('testdata/testdata.xlsx', 'TestCaseID_001');
    
    await page.goto('https://www.automationexercise.com/');
    await homePage.clickOnMenLink();
    await productPage.addToCart(testData.productIndex);
    
    const cartStatus = await productPage.getCartStatus();
    expect(cartStatus).toContain('Product added to cart');
    
    await writeReport('TestCaseID_001', 'Passed', 'reports/allure-results');
  });
});