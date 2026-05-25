import * as XLSX from 'xlsx';

export const readExcelData = (filePath: string, testCaseId: string) => {
  const workbook = XLSX.readFile(filePath);
  const sheetName = workbook.SheetNames[0];
  const worksheet = workbook.Sheets[sheetName];
  const data = XLSX.utils.sheet_to_json(worksheet, { header: 1 });

  const headers = data[0];
  const rows = data.slice(1);

  const testData = rows.find(row => row[0] === testCaseId);
  if (!testData) {
    throw new Error(`Test case ID ${testCaseId} not found in the Excel file.`);
  }

  const result = {};
  headers.forEach((header, index) => {
    result[header] = testData[index];
  });

  return result;
};