import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://www.automationexercise.com/');
  await page.getByRole('link', { name: ' Home' }).click();
  await page.getByRole('link', { name: ' Men' }).click();
  await page.getByText('Add to cart').nth(3).click();
});