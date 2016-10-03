package com.thoughtworks.DDF.Lang

import com.thoughtworks.DDF.Bool.ShowBool
import com.thoughtworks.DDF.Combinators.ShowComb
import com.thoughtworks.DDF.Double.ShowDouble
import com.thoughtworks.DDF.List.ShowList
import com.thoughtworks.DDF.Product.ShowProd
import com.thoughtworks.DDF.Sum.ShowSum
import com.thoughtworks.DDF.Unit.ShowUnit
import com.thoughtworks.DDF.Show

trait ShowLang extends
  SimpleLang[Show] with
  ShowComb with
  ShowDouble with
  ShowProd with
  ShowList with
  ShowSum with
  ShowUnit with
  ShowBool

object ShowLang {
  implicit def apply = new ShowLang {}
}
