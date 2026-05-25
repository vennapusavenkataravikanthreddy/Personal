import fs from 'fs';
import path from 'path';

export const writeReport = (testCaseId: string, status: string, reportDir: string) => {
  const outputPath = path.join(__dirname, '../output/test-summary.json');

  const reportData = {
    testCaseId,
    status,
    reportDir,
  };

  let existingData = [];

  if (fs.existsSync(outputPath)) {
    const rawData = fs.readFileSync(outputPath, 'utf-8');
    existingData = JSON.parse(rawData);
  }

  existingData.push(reportData);

  fs.writeFileSync(outputPath, JSON.stringify(existingData, null, 2));
};