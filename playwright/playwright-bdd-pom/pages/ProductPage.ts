import { BasePage } from './BasePage';
import { Locator, Page } from '@playwright/test';

export class ProductPage extends BasePage {
  private addToCartButton: Locator;

  constructor(page: Page) {
    super(page);
    this.addToCartButton = this.page.locator('selector-for-add-to-cart'); // Replace with actual selector from JSON
  }

  async addProductToCart() {
    await this.addToCartButton.click();
  }
}