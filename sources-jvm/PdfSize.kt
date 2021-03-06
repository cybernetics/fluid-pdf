package io.fluidsonic.pdf


public data class PdfSize(
	val width: PdfLengthUnit,
	val height: PdfLengthUnit
) {

	public companion object {

		public val A0: PdfSize = mm(width = 841.0, height = 1189.0)
		public val A1: PdfSize = mm(width = 594.0, height = 841.0)
		public val A2: PdfSize = mm(width = 420.0, height = 594.0)
		public val A3: PdfSize = mm(width = 297.0, height = 420.0)
		public val A4: PdfSize = mm(width = 210.0, height = 297.0)
		public val A5: PdfSize = mm(width = 148.0, height = 210.0)
		public val A6: PdfSize = mm(width = 105.0, height = 148.0)
		public val A7: PdfSize = mm(width = 74.0, height = 105.0)
		public val A8: PdfSize = mm(width = 52.0, height = 74.0)
		public val A9: PdfSize = mm(width = 37.0, height = 52.0)
		public val A10: PdfSize = mm(width = 26.0, height = 37.0)


		public fun cm(width: Double, height: Double): PdfSize =
			PdfSize(width = PdfLengthUnit.cm(width), height = PdfLengthUnit.cm(height))


		public fun inch(width: Double, height: Double): PdfSize =
			PdfSize(width = PdfLengthUnit.inch(width), height = PdfLengthUnit.inch(height))


		public fun mm(width: Double, height: Double): PdfSize =
			PdfSize(width = PdfLengthUnit.mm(width), height = PdfLengthUnit.mm(height))
	}
}
