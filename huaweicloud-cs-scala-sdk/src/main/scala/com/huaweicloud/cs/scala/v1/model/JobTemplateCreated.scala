/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.scala.v1.model

import com.huaweicloud.cs.scala.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class JobTemplateCreated (
  /*  */
  templateId: Option[Long],
  /* 模板名称 */
  name: Option[String],
  /* 模板描述 */
  desc: Option[String],
  /* 模板创建时间 */
  createTime: Option[Long],
  /* 模板创建是否成功 */
  isSuccess: Option[Boolean]
) extends ApiModel


