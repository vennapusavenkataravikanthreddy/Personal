module.exports = {
  default: {
    require: [
      'ts-node/register',
      'step-definitions/steps.ts',
      'support/hooks.ts',
      'support/world.ts'
    ],
    features: 'features/**/*.feature',
    timeout: 60000,
    format: [
      'json:reports/allure-results/results.json',
      'html:reports/html/report.html'
    ],
    publishQuiet: true,
    parallel: true,
    'retry': 2,
    'tags': '@smoke'
  }
};