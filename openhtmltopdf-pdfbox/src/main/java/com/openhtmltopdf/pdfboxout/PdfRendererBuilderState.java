package com.openhtmltopdf.pdfboxout;

import com.openhtmltopdf.extend.FSCacheEx;
import com.openhtmltopdf.extend.FSCacheValue;
import com.openhtmltopdf.outputdevice.helper.BaseRendererBuilder;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder.CacheStore;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder.PdfAConformance;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.OutputStream;
import java.util.EnumMap;
import java.util.Map;

/**
 * This class is internal. DO NOT USE! Just ignore it!
 */
public class PdfRendererBuilderState extends BaseRendererBuilder.BaseRendererBuilderState {
	/* Internal! */
	PdfRendererBuilderState() {
	}

	public OutputStream _os;
	public float _pdfVersion = 1.7f;
	public String _producer;
	public PDDocument pddocument;
        public final Map<CacheStore, FSCacheEx<String, FSCacheValue>> _caches = new EnumMap<>(CacheStore.class);
	public PdfAConformance _pdfAConformance = PdfAConformance.NONE;
	public boolean _pdfUaConform = false;
	public byte[] _colorProfile;
	public PageSupplier _pageSupplier;
}
