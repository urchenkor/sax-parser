package com.urchenkor.model.row;

import com.urchenkor.model.cell.Cell;

public interface Row {
    /**
     * Create cell in current row;
     * the alphabetic value of the column index will be converted to a numeric value.
     * A cell stores an alphabetic value.
     * The cell map of the current row stores the numeric index of the cell.
     * @param cellAlphabeticId - alphabetic id
     * @param value - {@code String} value of cell
     * @return new {@code Cell}
     */
    Cell createCell(String cellAlphabeticId, String value);

    /**
     * Create cell in current row. The cell index will be computed by [this.cells.Size() + 1],
     * the value will be null;
     * @return new {@code Cell}
     */
    Cell createCell();

    /**
     * Create cell in current row;
     * the alphabetic index of the column index will be converted to a numeric value.
     * A cell stores an alphabetic value.
     * The cell map of the current row stores the numeric index of the cell.
     * @param cellAlphabeticId - alphabetic id
     * @return new {@code Cell}
     */
    Cell createCell(String cellAlphabeticId);

    /**
     * getCell by numeric id
     * @param cellId numeric cell id
     * @return {@code Cell}  if exist or {@code null}
     */
    Cell getCell(int cellId);

    /**
     * get value from cell by numeric id
     * @param cellId numeric cell id
     * @return {@code String} value if exist or {@code null}
     */
    String getCellValue(int cellId);

    /**
     * getCell by alphabetic id
     * @param alphabeticId alphabetic cell id
     * @return {@code Cell}  if exist or {@code null}
     */
    Cell getCell(String alphabeticId);

    /**
     * get value from cell by alphabetic id
     * @param alphabeticId numeric cell id
     * @return {@code String} value if exist or {@code null}
     */
    String getCellValue(String alphabeticId);
}
