package com.urchenkor.model.workbook;

import com.urchenkor.model.sheet.Sheet;

public interface Workbook {
    Sheet createSheet(String name);

}
