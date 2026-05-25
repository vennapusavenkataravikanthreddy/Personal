import { defineConfig, devices } from '@playwright/test';

export default defineConfig({
  testDir: './tests',
  timeout: 30000,
  expect: {
    timeout: 5000,
  },
  reporter: [
    ['html', { outputFolder: 'reports/html' }],
    ['allure-playwright'],
    ['trace', { outputFolder: 'reports/trace' }],
  ],
  use: {
    actionTimeout: 0,
    baseURL: 'https://www.automationexercise.com/',
    trace: 'on-first-retry',
    headless: true,
    launchOptions: {
      slowMo: 50,
    },
  },
  projects: [
    {
      name: 'Chromium',
      use: { ...devices['Desktop Chrome'] },
    },
    {
      name: 'Firefox',
      use: { ...devices['Desktop Firefox'] },
    },
    {
      name: 'WebKit',
      use: { ...devices['Desktop Safari'] },
    },
  ],
  globalSetup: require.resolve('./utils/globalSetup'),
  globalTeardown: require.resolve('./utils/globalTeardown'),
});