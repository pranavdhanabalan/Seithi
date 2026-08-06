package com.pranavd.seithi;

import com.pranavd.seithi.DataModel.RenderedMessage;
import com.pranavd.seithi.DataModel.RowData;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PipelineManager {

    private final BlockingQueue<RowData> RowQueue = new LinkedBlockingQueue<>();

    private final BlockingQueue<RenderedMessage> messageQueue = new LinkedBlockingQueue<>();
}
