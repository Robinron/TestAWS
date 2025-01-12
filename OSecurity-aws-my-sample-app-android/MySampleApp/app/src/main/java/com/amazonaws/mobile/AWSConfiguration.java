//
// Copyright 2017 Amazon.com, Inc. or its affiliates (Amazon). All Rights Reserved.
//
// Code generated by AWS Mobile Hub. Amazon gives unlimited permission to 
// copy, distribute and modify it.
//
// Source code generated from template: aws-my-sample-app-android v0.15
//
package com.amazonaws.mobile;

import com.amazonaws.regions.Regions;

/**
 * This class defines constants for the developer's resource
 * identifiers and API keys. This configuration should not
 * be shared or posted to any public source code repository.
 */
public class AWSConfiguration {
    // AWS MobileHub user agent string
    public static final String AWS_MOBILEHUB_USER_AGENT =
        "MobileHub 4e4df632-2c8a-4c0e-b957-9d3e61c7c40c aws-my-sample-app-android-v0.15";
    // AMAZON COGNITO
    public static final Regions AMAZON_COGNITO_REGION =
      Regions.fromName("eu-west-1");
    public static final String  AMAZON_COGNITO_IDENTITY_POOL_ID =
        "eu-west-1:b3aade10-c009-40ed-94f7-422c4134f298";

    // S3 BUCKET
    public static final String AMAZON_S3_USER_FILES_BUCKET =
        "osecurity-userfiles-mobilehub-1924850191";
    // S3 BUCKET REGION
    public static final Regions AMAZON_S3_USER_FILES_BUCKET_REGION =
        Regions.fromName("eu-west-1");
    public static final String AMAZON_COGNITO_USER_POOL_ID =
        "eu-west-1_2F3hyifQN";
    public static final String AMAZON_COGNITO_USER_POOL_CLIENT_ID =
        "5in53dki8vtmph891d4uncf454";
    public static final String AMAZON_COGNITO_USER_POOL_CLIENT_SECRET =
        "gc7coq24o7oc4fstonj5p016283u689ah0tsqnsdr5ost2p8524";
}
