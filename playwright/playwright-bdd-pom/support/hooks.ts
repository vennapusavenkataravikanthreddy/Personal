import { Before, After } from '@cucumber/cucumber';
import { browser } from 'playwright';

Before(async function () {
  // Code to set up the test environment before each scenario
  this.page = await browser.newPage();
});

After(async function () {
  // Code to tear down the test environment after each scenario
  await this.page.close();
});