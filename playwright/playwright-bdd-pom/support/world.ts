import { setWorldConstructor } from '@cucumber/cucumber';

class CustomWorld {
  constructor() {
    this.sharedState = {};
  }
}

setWorldConstructor(CustomWorld);