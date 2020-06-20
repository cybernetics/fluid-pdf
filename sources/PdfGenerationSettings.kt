package io.fluidsonic.pdf


data class PdfGenerationSettings(
	val includeBackgrounds: Boolean,
	val pageMargins: PdfMargins,
	val pageOrientation: PdfOrientation,
	val pageSize: PdfSize,
	val preferCssPageSize: Boolean
) {

	companion object {

		val default: PdfGenerationSettings = PdfGenerationSettings(
			includeBackgrounds = true,
			pageMargins = PdfMargins.cm(all = 1.0),
			pageOrientation = PdfOrientation.portrait,
			pageSize = PdfSize.A4,
			preferCssPageSize = true
		)
	}
}