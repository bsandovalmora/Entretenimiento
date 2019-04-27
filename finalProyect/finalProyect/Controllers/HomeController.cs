using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace finalProyect.Controllers
{
    public class HomeController : Controller
    {
        // GET: Home
        public ActionResult Index()
        {
					if (TempData["message"] != null)
					{
						ViewBag.message = TempData["message"].ToString();
					}
            return View();
        }
				public ActionResult Main()
				{
					return View();
				}
				public ActionResult Mercado()
				{
					return View();
				}
				public ActionResult login()
				{
					int num = 0;

					if (num > 0)
					{//MetodoLoginBrandon(Request.Form['user'],Request.Form['password']);
						return View("Main");
					}
					else
					{
						TempData["message"] = "Usuario o contraseña incorrecta";
						return RedirectToAction("Index");
					}
				}
				public ActionResult sendEmail()
				{
					//metodo de recuperacion de contraseña que envia el email..
					//SendEmail(Request.Form['user']);
					return View();
				}
				public ActionResult Perfil()
				{
					return View();
				}
				public ActionResult Ingreso()
				{
					return View();
				}
				public ActionResult SaveUser()
				{

					//SaveCl(Request.Form[],Request.Form[],Request.Form[],Request.Form[],Request.Form[])
					//METODO BRANDON PARA AGREGAR CLIENTES
					return View();
				}
				public ActionResult DetalleProduct()
				{
					return View();
				}
    }
}