package com.example.demo.newOrder.controller;

import com.example.demo.delivery.object.NewOrderLongList;
import com.example.demo.delivery.object.ShortOrder;
import com.example.demo.newOrder.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;

@RestController
public class NewOrderController {

    @RequestMapping("newOrderTransaction_Vx0")
    public ShortOrder newOrderTransaction_Vx0(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs, @RequestBody NewOrderLongList supplierWarehouseIDs, @RequestBody NewOrderLongList orderQuantities) throws Exception {
        return new NewOrder_Vx0().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @RequestMapping("newOrderTransaction_VxA")
    public ShortOrder newOrderTransaction_VxA(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
        return new NewOrder_VxA().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @RequestMapping("newOrderTransaction_Vx056")
    public ShortOrder newOrderTransaction_Vx056(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
        return new NewOrder_Vx056().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @RequestMapping("newOrderTransaction_Vx081")
    public ShortOrder newOrderTransaction_Vx081(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
        return new NewOrder_Vx081().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @RequestMapping("newOrderTransaction_Vx103")
    public ShortOrder newOrderTransaction_Vx103(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
        return new NewOrder_Vx103().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @RequestMapping("newOrderTransaction_Vx119")
    public ShortOrder newOrderTransaction_Vx119(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
        return new NewOrder_Vx119().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @RequestMapping("newOrderTransaction_Vx144")
    public ShortOrder newOrderTransaction_Vx144(@RequestParam(name = "w_id") String w_id, @RequestParam(name = "d_id") String d_id, @RequestParam(name = "c_id") String c_id, @RequestParam(name = "o_ol_cnt") int o_ol_cnt, @RequestParam(name = "o_all_local") int o_all_local, @RequestBody NewOrderLongList itemIDs,@RequestBody NewOrderLongList supplierWarehouseIDs,@RequestBody NewOrderLongList orderQuantities) throws Exception {
        return new NewOrder_Vx144().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }
}