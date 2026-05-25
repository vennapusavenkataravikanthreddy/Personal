import { Given, When, Then } from '@cucumber/cucumber';
import { expect } from '@playwright/test';
import { HomePage } from '../pages/HomePage';
import { ProductPage } from '../pages/ProductPage';
import { ExcelReader } from '../utils/excelReader';

const homePage = new HomePage();
const productPage = new ProductPage();

Given('I navigate to the home page', async () => {
  await homePage.goto();
});

When('I click on the Men category', async () => {
  await homePage.clickMenCategory();
});

When('I add a product to the cart with ID {string}', async (testCaseId) => {
  const testData = await ExcelReader.getTestData(testCaseId);
  await productPage.addToCart(testData.productIndex);
});

Then('I should see the product in the cart', async () => {
  const isProductInCart = await productPage.isProductInCart();
  expect(isProductInCart).toBe(true);
});