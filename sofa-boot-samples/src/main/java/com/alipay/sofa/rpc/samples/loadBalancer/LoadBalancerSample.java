/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.samples.loadBalancer;

import org.springframework.context.ApplicationContext;

/**
 * load balance invoke
 *
 * @author <a href="mailto:lw111072@antfin.com">LiWei.Liangen</a>
 * @version $Id: CheckSample.java, v 0.1 2018年04月28日 上午1:57 LiWei.Liangen Exp $
 */
public class LoadBalancerSample {

    public void start(ApplicationContext applicationContext) {

        LoadBalancerService loadBalancerServiceReference = (LoadBalancerService) applicationContext
            .getBean("loadBalancerServiceReference");

        System.out.println(loadBalancerServiceReference.sayLoadBalancer("loadBalancer"));

    }
}