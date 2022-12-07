package com.urchenkor.model.sheet;

import com.urchenkor.exception.SAXParserException;
import com.urchenkor.model.row.Row;

public interface Sheet {
    /**
     * create a new row
     * @param rowNum numeric row number
     * @return created {@code Row}
     */
    Row createRow(int rowNum) throws SAXParserException;

    /**
     * create a new row. the row number will be computed by [this.rows.size() + 1]
     * @return created {@code Row}
     */
    Row createRow();

    /**
     * get row by row number
     * @param rowNum numeric row id
     * @return {@code Row}  if exist or {@code null}
     */
    Row getRow(int rowNum);

}
