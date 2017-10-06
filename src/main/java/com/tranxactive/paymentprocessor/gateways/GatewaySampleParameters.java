/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tranxactive.paymentprocessor.gateways;

import org.bson.Document;

/**
 *
 * @author ilyas <m.ilyas@live.com>
 */
interface GatewaySampleParameters {

    /**
     * This method returns ready to use api parameters with the merchant
     * specific keys. just populate your values and you are good to go.
     *
     * @return the sample API parameters required in all kind of merchant
     * interaction.
     */
    public abstract Document getApiSampleParameters();

    public abstract Document getRefundSampleParameters();

    public abstract Document getRebillSampleParameters();

    public abstract Document getVoidSampleParameters();
}