import { BasePage } from './BasePage';
import { Locator, Page } from '@playwright/test';

export class HomePage extends BasePage {
  private homeLink: Locator;
  private menLink: Locator;
  private addToCartButton: Locator;

  constructor(page: Page) {
    super(page);
    this.homeLink = this.page.getByRole('link', { name: ' Home' });
    this.menLink = this.page.getByRole('link', { name: ' Men' });
    this.addToCartButton = this.page.getByText('Add to cart');
  }

  async navigateToHome() {
    await this.homeLink.click();
  }

  async navigateToMen() {
    await this.menLink.click();
  }

  async addToCart(index: number) {
    await this.addToCartButton.nth(index).click();
  }
}