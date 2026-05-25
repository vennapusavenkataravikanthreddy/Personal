/*const {test} = require('@playwright/test');


test(' Browser Context Playwright Test', async({browser}) =>
     {

        chrome-plugins/ cookies
        const context = await browser.newContext();
        const page = await context.newPage();
        await page.goto('https://www.automationexercise.com/');
     });

     test('Page Playwright Test', async({page}) =>
     {

      
        await page.goto('https://www.automationexercise.com/');
    }); */

import { test, expect } from '@playwright/test';

test('UI Basic Test', async ({ page }) => {
  // Navigate to the website
  await page.goto('https://www.automationexercise.com/')
  await page.waitForTimeout(3000)
})